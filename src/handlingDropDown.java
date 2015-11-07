import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropDown {
	String baseDirectory = System.getProperty("user.dir");
	WebDriver driver;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// Opened the application

		driver.get(baseDirectory + "\\resources\\Sample_Webpage.html");

	}

	@Test
	public void testSelectFunctionality() throws InterruptedException {

		Select selectByValue = new Select(driver.findElement(By
				.id("SelectID_One")));

		selectByValue.selectByValue("greenvalue");

		Thread.sleep(5000);

		// select the second dropdown using "select by visible text"

		Select selectByVisibleText = new Select(driver.findElement(By
				.id("SelectID_Two")));

		selectByVisibleText.selectByVisibleText("Lime");

		Thread.sleep(5000);

		// select the third dropdown using "select by index"

		Select selectByIndex = new Select(driver.findElement(By
				.id("SelectID_Three")));

		selectByIndex.selectByIndex(3);

		Thread.sleep(5000);

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}