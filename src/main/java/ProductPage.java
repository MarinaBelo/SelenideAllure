import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage  {
    @FindBy(css = ".ingredients")
    SelenideElement ingredients;

    public SelenideElement getIngredients() {
        return ingredients;
    }

}
