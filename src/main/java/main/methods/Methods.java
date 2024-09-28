package main.methods;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static main.driver.OpenDriver.*;

@Component
public class Methods {
    public Methods fill(String selector, String text, String actionPage) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("["+selector+"]")).sendKeys(text);
        return this;
    }

    public Methods click(String selector, String actionPage) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("["+selector+"]")).click();
        return this;
    }

    public Methods initPage(String path) throws IOException {
        page(props(path));
        return this;
    }
}
