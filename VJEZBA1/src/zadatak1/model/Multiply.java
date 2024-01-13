package zadatak1.model;

public class Multiply implements Calculation{

    @Override
    public float calculate(float firstNum, float secondNum) {
        return firstNum * secondNum;
    }

    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public String toString() {
        return "Multiply";
    }
}
