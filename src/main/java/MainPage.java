import io.qameta.allure.Step;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import java.util.Set;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(css = ".inner>.fa.fa-bars")
    SelenideElement mainMenu;
    @FindBy(css = ".-one >h2")
    SelenideElement contentWelcome;
    @FindBy(css = ".-one >h2~.home-button")
    SelenideElement findYourWineButton;
    @FindBy(css = "#primary-footer")
    SelenideElement footer;
    @FindBy(xpath = "//*[text()='We are passionate about creating great tasting, quality wines for everyone to enjoy']")
    SelenideElement slogan;
    //header with all needed links
    @FindBy(css = ".top-nav .yt-logo")
    SelenideElement yellowTailLogo;
    @FindBy(css = ".inner a[href$=\"/wines/\"]")
    SelenideElement linkWines;
    @FindBy(css = ".inner a[href$=\"/stores/\"]")
    SelenideElement linkStores;
    @FindBy(css = ".inner a[href$=\"/cocktails/\"]")
    SelenideElement linkCocktails;
    @FindBy(css = ".inner a[href$=\"/our-story/\"]")
    SelenideElement linkOurStory;
    @FindBy(css = ".inner a[href$=\"/faqs/\"]")
    SelenideElement linkFAQS;
    @FindBy(css = ".inner a[href$=\"/contact/\"]")
    SelenideElement linkContact;
    @FindBy(css = ".inner #country-select")
    SelenideElement linkCountry;
    @FindBy(css = "[aria-label=\"Go to the China YellowTail website\"]")
    SelenideElement globeIconChina;
    @FindBy(css = ".social-weibo")
    SelenideElement iconChinaWeibo;
    @FindBy(css = "title")
    SelenideElement title;

    @Step
    public void clickOnMainMenu(){
        mainMenu.click();
    }

    @Step
    public void clickOnYellowTailLogo(){
        yellowTailLogo.click();
    }

    public void clickOnGlobeIcon(){
        linkCountry.click();
    }

    @Step
    public void clickOnGlobeIconChina(){
        globeIconChina.click();
    }

    @Step
    public WeiboPage clickOnIconChinaWeibo(){
        iconChinaWeibo.click();
        return page(WeiboPage.class);
    }

    public StorePage clickOnLinkStores(){
        linkStores.click();
        return page(StorePage.class);
    }

    public CocktailsPage clickOnLinkCocktails(){
        linkCocktails.click();
        return page(CocktailsPage.class);
    }

   /* @Step
    public String getWindowHandle(){
        return DriverProvider.INSTANCE.getDriver().getWindowHandle();
    }

    @Step
    public Set<String> getWindowHandles(){
        return DriverProvider.INSTANCE.getDriver().getWindowHandles();
    }

    @Step
    public void driverSwitchTo(String str){
        DriverProvider.INSTANCE.getDriver().switchTo().window(str);
    }
  */
    @Step
    public SelenideElement getTitle(){
        return title;
    }

    @Step
    public SelenideElement getMainMenu() {
        return mainMenu;
     }

    public SelenideElement getContentWelcome() {
        return contentWelcome;
    }

    public SelenideElement getFindYourWineButton() {
        return findYourWineButton;
    }

    public SelenideElement getFooter() {
        return footer;
    }

    public SelenideElement getSlogan() {
        return slogan;
    }

    public SelenideElement getYellowTailLogo() {
        return yellowTailLogo;
    }

    public SelenideElement getLinkWines() {
        return linkWines;
    }

    public SelenideElement getLinkStores() {
        return linkStores;
    }

    public SelenideElement getLinkCocktails() {
        return linkCocktails;
    }

    public SelenideElement getLinkOurStory() {
        return linkOurStory;
    }

    public SelenideElement getLinkFAQS() {
        return linkFAQS;
    }

    public SelenideElement getLinkContact() {
        return linkContact;
    }

    public SelenideElement getLinkCountry() {
        return linkCountry;
    }
}
