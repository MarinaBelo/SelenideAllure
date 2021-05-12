import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import java.util.Set;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static utils.Constants.BASIC_URL;

public class MainPageTest extends SelenideRunner{

    @Epic("Selenide+Allure")
    @Description("Navigate to main page")
    @Test
    //Case 3
    public void mainPageAllRequiredElements() {
        //1. Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        //2. Verify that the following elements are displayed
        welcomePage.getMainMenu().shouldBe(visible);
        mainPage.getContentWelcome().shouldBe(visible);
        mainPage.getFindYourWineButton().shouldBe(visible);
        mainPage.getFooter().shouldBe(visible);
        mainPage.getSlogan().shouldBe(visible);
    }

    @Epic("Selenide+Allure")
    @Description("Menu Button Logic Open Header -> Verify that header with all needed links is appeared")
    @Test
    //Case 4
    public void menuButtonLogicOpenHeader() {
        //1. Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        //2.Click on Menu button
        mainPage.clickOnMainMenu();
        //3.Verify that header with all needed links is appeared
        mainPage.getYellowTailLogo().shouldBe(visible);
        mainPage.getLinkWines().shouldBe(visible);
        mainPage.getLinkStores().shouldBe(visible);
        mainPage.getLinkCocktails().shouldBe(visible);
        mainPage.getLinkOurStory().shouldBe(visible);
        mainPage.getLinkFAQS().shouldBe(visible);
        mainPage.getLinkContact().shouldBe(visible);
        mainPage.getLinkCountry().shouldBe(visible);
        //4. Click on [yellow tail]
        mainPage.clickOnYellowTailLogo();
        //5. Verify that Menu button is visible
        welcomePage.getMainMenu().shouldBe(exist);
    }

    @Epic("Selenide+Allure")
    @Description("Menu Button Logic Close Header")
    @Test
    //Case 5
    public void menuButtonLogicCloseHeader() {
        //1. Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        //2.Click on Menu button
        mainPage.clickOnMainMenu();
        //3. Click on [yellow tail]
        mainPage.clickOnYellowTailLogo();
        //4. Verify that Menu button is visible
        welcomePage.getMainMenu().shouldBe(visible);
    }

    @Epic("Selenide+Allure")
    @Description("Main page: Global Nav logic")
    @Test
    //Case 6
    public void globalNavLogic() {
        //1. Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        //2.Click on Menu button
        mainPage.clickOnMainMenu();
        //3. Click on Globe icon
        mainPage.clickOnGlobeIcon();
        //4. Select China in popup and click on it
        mainPage.clickOnGlobeIconChina();
        //5. Verify that language is changed
        mainPage.getTitle().shouldHave(text("Yellow tail 黄尾袋鼠中文官网"));
    }

    @Epic("Selenide+Allure")
    @Description("Global Nav logic (CHINA - separate site is open)")
    @Test
    //Case 7
    public void globalNavLogicChina() {
        //1. Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        //2.Click on Menu button
        mainPage.clickOnMainMenu();
        //3. Click on Globe icon
        mainPage.clickOnGlobeIcon();
        //4. Select China in popup and click on it
        mainPage.clickOnGlobeIconChina();
        // получаем набор дескрипторов текущих открытых окон
        /*
        String originalWindow = mainPage.getWindowHandle();
        final Set<String> oldWindowsSet = mainPage.getWindowHandles();
        //5. Click on icon
        WeiboPage weiboPage = mainPage.clickOnIconChinaWeibo();
        weiboPage.switchToWeiboPage(oldWindowsSet);
        //6. Verify that “https://www.weibo.com/yellowtailChina” site is open in new tab
        String newWindowTitle = weiboPage.getTitle();
        System.out.println("New window title: " + newWindowTitle);
        weiboPage.driverClose();
        mainPage.driverSwitchTo(originalWindow);
        String originalWindowTitle = mainPage.getTitle();
        System.out.println("Old window title: " + originalWindowTitle);
        Assertions.assertNotEquals(newWindowTitle, originalWindowTitle);
    }*/
    }
}
