import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSquareOrSubstractTest {

    @Test
    void testGreaterFirstNumber() {
        //GIVEN
        int a = 2;
        int b = 1;
        boolean subtract = false;
        SumSquareOrSubstract sumSquareOrSubstract = new SumSquareOrSubstract();
        //WHEN
        int result = sumSquareOrSubstract.sumSquareOrSubstract(a, b, subtract);
        //THEN
        assertEquals(3, result);
    }

    @Test
    void testGreaterSecondNumber() {
        //GIVEN
        int a = 1;
        int b = 2;
        boolean subtract = false;
        SumSquareOrSubstract sumSquareOrSubstract = new SumSquareOrSubstract();
        //WHEN
        int result = sumSquareOrSubstract.sumSquareOrSubstract(a, b, subtract);
        //THEN
        assertEquals(2, result);
    }

    @Test
    void testEqualNumbers() {
        //GIVEN
        int a = 2;
        int b = 2;
        boolean subtract = false;
        SumSquareOrSubstract sumSquareOrSubstract = new SumSquareOrSubstract();
        //WHEN
        int result = sumSquareOrSubstract.sumSquareOrSubstract(a, b, subtract);
        //THEN
        assertEquals(4, result);
    }
}