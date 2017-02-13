import org.openqa.selenium.WebDriver;//References the WebDriver interface which is required to instantiate a new web browser.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;//References the FirefoxDriver class that is required instantiate a Firefox specific driver on the browser


public class Gmail_Login {
    public static void main(String[] args) {
        WebDriver driver; // objects and variables instantiation
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\esteban.vega\\Downloads\\selenium-java-3.0.1\\geckodriver.exe");
        driver = new FirefoxDriver();
        String appUrl = "https://accounts.google.com"; // launch the firefox browser and open the application url
        driver.get(appUrl);

        driver.manage().window().maximize(); // maximize the browser window
        String expectedTitle = "Sign in - Google Accounts"; // declare and initialize the variable to store the expected title of the webpage.
        String actualTitle = driver.getTitle(); // fetch the title of the web page and save it into a string variable

        if (expectedTitle.equals(actualTitle)) // compare te expected title of the page with the actual title of the page and print the result

        {
            System.out.println("Verification Successful - The correct title is displayed on the web page.");

        } else

        {

            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

        }
        WebElement username = driver.findElement(By.id("Email")); // enter a valid username in the email textbox
        username.clear();
        username.sendKeys("esteban.vega@globant.com");
        WebElement SignInButton = driver.findElement(By.id("next")); // click on the Sign in button
        SignInButton.click();
        TearDown();
        WebElement password = driver.findElement(By.id("Passwd")); // enter a valid password in the password textbox
        password.clear();
        password.sendKeys("2363840Ev");

        SignInButton = driver.findElement(By.id("signIn")); // click on the Sign in button
        SignInButton.click();
        driver.close(); // close the web browsers
        System.out.println("exito :)"); // terminate the program
        System.exit(0);
    }

    public static void TearDown () {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}

