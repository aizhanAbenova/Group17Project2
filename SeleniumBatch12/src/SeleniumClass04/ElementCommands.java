package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadioButton= driver.findElement(By.xpath(("(//input[@name='optradio'])[1]")));
        boolean isMarriedRadioButtonEnabled=marriedRadioButton.isEnabled();
        System.out.println(isMarriedRadioButtonEnabled);

        if (!isMarriedRadioButtonEnabled) {
            System.out.println("Not Enabled");
        } else {
            System.out.println("Enabled");
        }

        boolean isMarriedButtonDisplayed=marriedRadioButton.isDisplayed();
        System.out.println(isMarriedButtonDisplayed);

        boolean isMarriedRadioButtonSelected=marriedRadioButton.isSelected();
        System.out.println(isMarriedRadioButtonSelected);
    }
}
