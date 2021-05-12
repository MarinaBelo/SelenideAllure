import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selenide.page;


public class CocktailsPage {

    @FindBy(css = "[aria-label*=\"Raspberry Rosé\"]")
    SelenideElement raspberryRose;
    @FindBy(css = ".toggle")
    SelenideElement select;
    @FindBy(css = "[data-value=\"red\"]")
    SelenideElement redWineCocktails;
    @FindBy(css = "[data-value=\"bubbles\"]")
    SelenideElement sparklingWineCocktails;
    @FindBy(xpath = "//*[text()='Multiple']")
    SelenideElement multiple;
    @FindBy(css = "[data-types=\"red\"]")
    ElementsCollection redWineCocktailsRecipes;
    @FindBy(css = "[data-types=\"bubbles\"]")
    ElementsCollection sparklingRecipes;

    @Step
    public void clickOnSelect(){
        select.click();
    }

    public  void clickOnRedWineCocktails(){
        redWineCocktails.click();
    }

    public  void clickOnSparklingWineCocktails(){
        sparklingWineCocktails.click();
    }

    public ProductPage clickOnRaspberryRose(){
        raspberryRose.click();
        return page(ProductPage.class);
    }

    @Step
    public void scrollToElement(SelenideElement SelenideElement){
        SelenideElement.scrollIntoView(false);
    }

    public SelenideElement getSelect() {
        return select;
    }

    public SelenideElement getMultiple() {
        return multiple;
    }

    public SelenideElement getRedWineCocktails() {
        return redWineCocktails;
    }

    public SelenideElement getSparklingWineCocktails() {
        return sparklingWineCocktails;
    }

    public SelenideElement getRaspberryRose() {
        return raspberryRose;
    }

    public int countOfRedWineCocktailsRecipes(){
        return redWineCocktailsRecipes.size();
    }

    public int countRedWineSparklingRecipes(){
        return (redWineCocktailsRecipes.size()+sparklingRecipes.size());
    }
}
