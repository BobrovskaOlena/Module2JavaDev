import com.goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;
    @BeforeEach
    public void startTest(){
        calculator=new SumCalculator();
    }
    @Test
    public void testWithOne(){

        int actual =calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testWithThree(){
        int actual =calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testWithZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
