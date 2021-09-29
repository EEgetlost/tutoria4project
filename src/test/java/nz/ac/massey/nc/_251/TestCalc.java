package nz.ac.massey.nc._251;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void testAdd() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result_add = Calc.add(a, b);
        Assertions.assertEquals(a + b, result_add);
    }
    @Test
    public  void testSubtract() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result_subtract = Calc.subtract(a, b);
        Assertions.assertEquals(a + b, result_subtract);
    }

}
