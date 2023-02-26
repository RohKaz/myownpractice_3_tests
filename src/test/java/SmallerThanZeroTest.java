import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallerThanZeroTest {

    @Test
    void smallerThanZeroNegative() {
        //GIVEN
        int number = -1;
        SmallerThanZero stzTester = new SmallerThanZero();
        //WHEN
        boolean result = stzTester.smallerThanZero(number);
        //THEN
        assertEquals(true, result);
    }

    @Test
    void smallerThanZeroPositive() {
        //GIVEN
        int number = 1;
        SmallerThanZero stzTester = new SmallerThanZero();
        //WHEN
        boolean result = stzTester.smallerThanZero(number);
        //THEN
        assertEquals(false, result);
    }

    @Test
    void smallerThanZeroZero() {
        //GIVEN
        int number = 0;
        SmallerThanZero stzTester = new SmallerThanZero();
        //WHEN
        boolean result = stzTester.smallerThanZero(number);
        //THEN
        assertEquals(false, result);
    }
}