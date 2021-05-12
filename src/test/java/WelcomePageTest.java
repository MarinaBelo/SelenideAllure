import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static utils.Constants.BASIC_URL;

public class WelcomePageTest extends SelenideRunner{
    @Epic("Selenide+Allure")
    @Description("Verify that all required elements are displayed")
    @Test
    //Case 1
    public void allRequiredElementsAreDisplayed() {
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        welcomePage.getLabelConfirm().shouldHave(text("I am of legal drinking age in"));
        welcomePage.getCheckBoxConfirm().shouldBe(hidden);
        welcomePage.getDropdownCountry().shouldBe(visible);
        welcomePage.getWelcomeButton().shouldBe(visible);
    }

    @Epic("Selenide+Allure")
    @Description("Navigate to  main page as European customer")
    @Test
    //Case 2
    public void navigateToMainPageAsEuropeanCustomer() {
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        //Main page should be displayed
        welcomePage.getMainMenu().shouldBe(visible);
    }
}



