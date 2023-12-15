package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class ResultPage {
    public ResultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h3")
    List<WebElement> searchResultHeadersListElements;

    public List<String> getSearchResultTextList(){
        List<String> listOfSearchResult = new ArrayList<>();
        for (WebElement e : searchResultHeadersListElements){
            listOfSearchResult.add(e.getText());
        }
        return listOfSearchResult;
    }
}
