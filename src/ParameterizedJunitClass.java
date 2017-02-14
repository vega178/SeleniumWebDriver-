import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by ESTEBAN on 13/02/2017.
 */
@RunWith(Parameterized.class)
public class ParameterizedJunitClass {

    public String name;
    public int age;

    public ParameterizedJunitClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Parameters
    private static Collection<Object[]> parameter(){
        Object[][] pData = new Object[2][2];
        pData[0][0] = "pedro";
        pData[0][1] = 30;
        pData[1][0] = "mateo";
        pData[1][1] = 40;

        return Arrays.asList(pData);
    }

    @Test
    public void testMethod(){
        System.out.println("Name is: "+ name + "and age is: "+ age);
    }




}
