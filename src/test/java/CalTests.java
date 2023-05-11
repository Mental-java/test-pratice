import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.Calculator;

public class CalTests {

    @Test
    public void testDivision(){

        Calculator calculator = new Calculator();

        int answer = calculator.division(10, 2);
        Assertions.assertEquals(10 / 2, answer);
    }
}
