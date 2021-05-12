import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.page;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

    @FindBy(css = "[for=confirm]")
    SelenideElement labelConfirm;
    @FindBy(css = "[type=checkbox]")
    SelenideElement checkBoxConfirm;
    @FindBy(css = "[for=\"confirm\"]")
    SelenideElement confirmAge;
    @FindBy(css = "select.agegate-selector-options")
    SelenideElement dropdownCountry;
    @FindBy(css = "input[value=Welcome]")
    SelenideElement welcomeButton;
    @FindBy(css = ".fa.fa-bars")
    SelenideElement mainMenu;

    public void confirmAgeCheck(){
        confirmAge.click();
    }

    public MainPage clickOnWelcomeButton(){
        welcomeButton.click();
        return page(MainPage.class);
    }

    public void selectDropdownByIndex(int index){
        Select dropdownCountry = new Select(getDropdownCountry());
        dropdownCountry.selectByIndex(index);
    }

    @Step("Main page should be displayed")
    public MainPage navigateToMainPageAsEuropeanCustomer(){
        confirmAgeCheck();
        selectDropdownByIndex(3);
        clickOnWelcomeButton();
        return page(MainPage.class);

    }

    public SelenideElement getLabelConfirm() {
        return labelConfirm;
    }

    public SelenideElement getCheckBoxConfirm() {
        return checkBoxConfirm;
    }

    public SelenideElement getDropdownCountry() {
        return dropdownCountry;
    }

    public SelenideElement getWelcomeButton() {
        return welcomeButton;
    }

    public SelenideElement getMainMenu() {
        return mainMenu;
    }
}
