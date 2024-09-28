package main.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.methods.Methods;
import main.selectors.Automation;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OpenDriver {

    public static WebDriver driver;

    @Autowired
    public Methods methods;

    @Autowired
    public Automation selectorPage;

    public static String props(String path) throws IOException {
        Properties prop =new Properties();
        FileInputStream in = new FileInputStream("src/main/resources/config.properties");
        prop.load(in);
        return prop.getProperty(path);
    }

    public static WebDriver page(String path) {
        if (driver != null) driver.quit();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(1920, 0));
        driver.manage().window().maximize();
        driver.get((path));
        return driver;
    }

}
