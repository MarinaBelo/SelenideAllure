import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

public class WeiboPage {

    @FindBy(css = "title")
    SelenideElement title;

    @Step
    public SelenideElement getTitle(){
        return title;
    }

    /*
    @Step
    public void switchToWeiboPage(Set<String> oldWindowsSet) {
        String newWindow = (new WebDriverWait(DriverProvider.INSTANCE.getDriver(), 2))
                .until(new ExpectedCondition<String>() {
                    public String apply(WebDriver driver) {
                        Set<String> newWindowsSet = driver.getWindowHandles();
                        newWindowsSet.removeAll(oldWindowsSet);
                        return newWindowsSet.size() > 0 ?
                                newWindowsSet.iterator().next() : null;
                    }
                });
        DriverProvider.INSTANCE.getDriver().switchTo().window(newWindow);
    }

    public void driverClose () {
        DriverProvider.INSTANCE.getDriver().close();
        }*/
}
