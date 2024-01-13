package zadatak1.model;

public class Division implements Calculation{

    @Override
    public float calculate(float firstNum, float secondNum) {
        return firstNum / secondNum;
    }

    @Override
    public String symbol() {
        return "/";
    }

    @Override
    public String toString() {
        return "Division";
    }
}
