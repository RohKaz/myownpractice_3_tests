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

    @Test
    void fizzBuzzFizz(){
        //GIVEN
        FizzBuzz fizzer = new FizzBuzz();

        //WHEN
        String[] zahlenwort = {"Null","Eins","Zwei","Drei","Vier","Fünf","Sechs","Sieben","Acht","Neun","Zehn"};
        String result = fizzer.fizzbuzz(3);

        //THEN
        assertEquals("fizz", result);

    }

    @Test
    void fizzBuzzBuzz(){
        //GIVEN
        FizzBuzz fizzer = new FizzBuzz();

        //WHEN
        String[] zahlenwort = {"Null","Eins","Zwei","Drei","Vier","Fünf","Sechs","Sieben","Acht","Neun","Zehn"};
        String result = fizzer.fizzbuzz(5);

        //THEN
        assertEquals("buzz", result);
    }

    @Test
    void fizzBuzzFizzBuzz(){
        //GIVEN
        FizzBuzz fizzer = new FizzBuzz();

        //WHEN
        String[] zahlenwort = {"Null","Eins","Zwei","Drei","Vier","Fünf","Sechs","Sieben","Acht","Neun","Zehn"};
        String result = fizzer.fizzbuzz(15);

        //THEN
        assertEquals("fizzbuzz", result);

    }


}