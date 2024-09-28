package automation;

import main.Main;
import main.driver.OpenDriver;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = Main.class)
@ExtendWith(SpringExtension.class)
public class Tests extends OpenDriver {

    @Order(1)
    @Test
    public void Open() throws IOException, InterruptedException {
        methods.initPage("url");

        methods.fill(selectorPage.USER, "standard_user", "Filling in the Username field");
        methods.fill(selectorPage.PASSWORD, "secret_sauce", "Filling in the Password field");
        methods.click(selectorPage.LOGIN, "Click on the login button");
        methods.click(selectorPage.PRODUCT1, "Sauce Labs Backpack product selected");
        methods.click(selectorPage.PRODUCT2, "Sauce Labs Bike Light product selected");
        methods.click(selectorPage.SHOPPING, "Click on Shopping");
        methods.click(selectorPage.CHECKOUT, "Click on Checkout");
        methods.fill(selectorPage.FIRSTNAME, "Gabriel", "Filling in the first name");
        methods.fill(selectorPage.LASTNAME, "Lopes", "Filling in the Last name field");
        methods.fill(selectorPage.POSTALCODE, "11111111", "Filling in the Postal Code field");
        methods.click(selectorPage.BUTTONCONTIN, "Click on the Continue button");
    }
}
