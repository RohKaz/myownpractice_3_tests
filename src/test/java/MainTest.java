import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @BeforeEach
    void setUp() {


    }

    @Test
    void calculateAdd() {
        //GIVEN
        int a = 2;
        int b = 2;
        //WHEN
        int result = Main.calculateAdd(a, b);
        //THEN
        assertEquals(4, Main.calculateAdd(2, 2));
    }


}