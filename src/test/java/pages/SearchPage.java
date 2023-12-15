package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBoxInputFieldElement;

    public void searchFor(String searchText){
        searchBoxInputFieldElement.sendKeys(searchText+ Keys.ENTER);
    }
}
