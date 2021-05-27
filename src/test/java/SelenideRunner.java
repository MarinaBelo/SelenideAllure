import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import static com.codeborne.selenide.WebDriverRunner.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class SelenideRunner {

    @BeforeSuite
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterMethod
    static void closeBrowser() {
        Selenide.closeWebDriver();
    }
}