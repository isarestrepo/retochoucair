package retochoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class RetoChoucairLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("write the user")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("write the Password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Button to confirm login")
            .located(By.id("login-button"));
    public static final Target ADD_TO_CART_ONE = Target.the("Add to cart one")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADD_TO_CART_TWO = Target.the("Add to cart two")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BUTTON_SHOPPING = Target.the("Button shopping")
            .located(By.id("shopping_cart_container"));
    public static final Target BUTTON_CHECKOUT = Target.the("Button Checkout")
            .located(By.id("checkout"));
    public static final Target INPUT_FIRST_NAME = Target.the("Write the first name")
            .located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("Write the Last name")
            .located(By.id("last-name"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Write the postal code")
            .located(By.id("postal-code"));
    public static final Target BUTTON_CONTINUE = Target.the("Button Continue")
            .located(By.id("continue"));
    public static final Target BUTTON_FINISH = Target.the("Button Finish")
            .located(By.id("finish"));
    public static final Target CONFIRM_SHOPPING = Target.the("Shopping Confirm")
            .located(org.openqa.selenium.By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"));
}
