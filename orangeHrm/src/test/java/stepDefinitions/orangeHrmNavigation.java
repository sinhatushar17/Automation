package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import pages.orangeHrmHome;

public class orangeHrmNavigation {

	public orangeHrmNavigation() {
		// TODO Auto-generated constructor stub //cons
	}
	
	WebDriver driver;
    //no need of constructor here  i.e. super(driver);

	orangeHrmHome orangeHrmHome = new orangeHrmHome();
	
    @Given(": We navigate to OrangeHrm website")
    public void navigateToOrangeHrm(){
//    	orangeHrmHome orangeHrmHome = new orangeHrmHome(driver);
    	orangeHrmHome = orangeHrmHome.navigateToOrangeHrmHomePage();
    	
//    	 System.setProperty("webdriver.edge.driver","C:\\Users\\2000078341\\eclipse-workspace\\orangeHrm\\drivers\\msedgedriver.exe");
//
//         WebDriver driver = new EdgeDriver();
//         driver.manage().window().maximize();
//         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   //("https://google.com");
//         System.out.println("At OrangeHRM home page");
        
    }
    
    

    @When(": We enter the existing valid credentials and attempt a login")
    public void performLogin(){
		orangeHrmHome.performLoginByExistingCredentials();
        driver.quit();
    }
	
	

}
