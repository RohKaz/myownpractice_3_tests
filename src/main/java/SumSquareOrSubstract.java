public class SumSquareOrSubstract {


    public static int sumSquareOrSubstract(int number1, int number2, boolean subtract) {
        if (subtract) {
            return number1 - number2;
        } else if (number1 > number2) {
            return number1 + number2;
        } else {
            return number1 * number2;
        }
    }







}
