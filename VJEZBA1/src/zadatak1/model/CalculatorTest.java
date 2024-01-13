package zadatak1.model;

public class CalculatorTest {

    public static void main(String[] args) {

        float firstNum = 12.3f;
        float secondNum = 3.9f;

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setCalculation(new Exponent());
        simpleCalculator.performCalculation(firstNum, secondNum);
    }
}
