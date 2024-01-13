package zadatak1.model;

public class SimpleCalculator extends Calculator{

    @Override
    public float performCalculation(float firstNum, float secondNum) {
        float result = calculation.calculate(firstNum, secondNum);
        display(result);
        return result;
    }
}
