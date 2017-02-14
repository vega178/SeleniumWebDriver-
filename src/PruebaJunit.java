import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by esteban.vega on 13/02/2017.
 * training topic Junit with selenium
 */

public class PruebaJunit {
    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("Executed before class method");
    }

    @Before // annotacions is used to run any specific test before each test
    public void beforeTest() {

        System.out.println("Running before test");
    }

    @Test // annotacions is used  to run a Junit
    public void junitTest() {

        System.out.println("Running Junit test");
    }

    @Test
    public void SecondJunitTest() {
        System.out.println("Running second Junit test");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("Running after class method");
    }

}
