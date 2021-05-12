import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class StorePage {

    @FindBy(css = "#locationName")
    SelenideElement location;
    @FindBy(css = ".search-submit")
    SelenideElement searchButton;
    @FindBy(css = ".results")
    SelenideElement results;

    public void clickOnLocation(){
        location.click();
    }

    public void clickOnSearchButton(){
        getSearchButton().click();
    }

    public void locationSendKeys (String city){
        getLocation().setValue(city);
    }

    public SelenideElement getLocation() {
        return location;
    }

    public SelenideElement getSearchButton() {
        return searchButton;
    }

    public SelenideElement getResults() {
        return results;
    }
}
