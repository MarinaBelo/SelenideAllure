import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static utils.Constants.BASIC_URL;

public class CocktailsPageTest extends SelenideRunner {
    @Epic("Page Object+Allure for web-site www.yellowtailwine.com")
    @Description("Select One Wine and Verify that 7 recipes are displayed")
    @Test
    //Case 9
    public void selectOneWine() {
        //Pre-condition-1 Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        mainPage.clickOnMainMenu();
        //1. Navigate to “Cocktails” page
        CocktailsPage cocktailsPage = mainPage.clickOnLinkCocktails();
        //2. Select “Red wine cocktails”
        cocktailsPage.clickOnSelect();
        cocktailsPage.clickOnRedWineCocktails();
        //3. Verify that 7 recipes are displayed
        int expectedQuantityOfRedVines =7;
        System.out.println("Count of displayed recipes " + cocktailsPage.countOfRedWineCocktailsRecipes());
        assertEquals(expectedQuantityOfRedVines,cocktailsPage.countOfRedWineCocktailsRecipes());
    }

    @Epic("Page Object+Allure for web-site www.yellowtailwine.com")
    @Description("Navigate to Cocktail recipe page")
    @Test
    //Case 10
    public void navigateToCocktailRecipePage() {
        //Pre-condition-1 Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        mainPage.clickOnMainMenu();
        //1. Navigate to “Cocktails” page
        CocktailsPage cocktailsPage = mainPage.clickOnLinkCocktails();
        //2. Scroll to “RASPBERRY ROSE” recipe
        cocktailsPage.scrollToElement(cocktailsPage.getRaspberryRose());
        //3. Click on “RASPBERRY ROSE” recipe
        ProductPage productPage = cocktailsPage.clickOnRaspberryRose();
        //4. Verify that new page is displayed:- ingredients section is displayed
        url().equalsIgnoreCase("https://www.yellowtailwine.com/recipe/raspberry-rose");
        productPage.getIngredients().shouldBe(visible);
    }

    @Epic("Page Object+Allure for web-site www.yellowtailwine.com")
    @Description("Select several wines")
    @Test
    //Case 11
    public void selectSeveralWines() {
        //Pre-condition-1 Navigate to main page
        WelcomePage welcomePage = open(BASIC_URL, WelcomePage.class);
        MainPage mainPage = welcomePage.navigateToMainPageAsEuropeanCustomer();
        mainPage.clickOnMainMenu();
        //1. Navigate to “Cocktails” page
        CocktailsPage cocktailsPage = mainPage.clickOnLinkCocktails();
        //2. Select “Red wine cocktails”
        cocktailsPage.clickOnSelect();
        cocktailsPage.clickOnRedWineCocktails();
        //3. Select “Sparkling wine cocktails”
        cocktailsPage.clickOnSparklingWineCocktails();
        //4. Verify that “Multiple” word is displayed in “Type” dropdownCountry
        cocktailsPage.getMultiple().shouldBe(visible);
        //5. Verify that 18 recipes are displayed
        int expectedRedWineSparklingRecipes=18;
        System.out.println("Count of displayed recipes " + cocktailsPage.countRedWineSparklingRecipes());
        assertEquals(expectedRedWineSparklingRecipes, cocktailsPage.countRedWineSparklingRecipes());
    }

}
