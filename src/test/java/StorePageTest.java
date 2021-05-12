import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static utils.Constants.BASIC_URL;

public class StorePageTest extends SelenideRunner {
    @Epic("Page Object+Allure for web-site www.yellowtailwine.com")
    @Description("Enter Valid Location")
    @Test
    //Case 8
    public void enterValidLocation()  {
        //Pre-condition-1 Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        mainPage.clickOnMainMenu();
        //1.Navigate to “Where to buy” page
        StorePage storePage = mainPage.clickOnLinkStores();
        //2.Enter valid data in “Your location” field
        storePage.clickOnLocation();
        storePage.locationSendKeys("Madrid");
        //3. Click on Search button
        storePage.clickOnSearchButton();
        //4.Verify that the results of search are displayed
        storePage.getResults().shouldBe(visible);
    }
}
