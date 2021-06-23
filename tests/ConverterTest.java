import com.hyperiusblake.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConverterTest {

    @Test
    public void F_to_C_Test() {

        Main m = new Main();

        double expectedResult = 10.00;
        double actualResult = Main.fahrToCel(50);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void C_to_F_Test() {

        Main m = new Main();

        double expectedResult = -12.00;
        double actualResult = Main.fahrToCel(10);

        Assert.assertEquals(expectedResult, actualResult);

    }


}
