package zadatak1.model;

public class Average implements Calculation{
    @Override
    public float calculate(float firstNum, float secondNum) {
        return (firstNum + secondNum) / 2;
    }

    @Override
    public String symbol() {
        return "average";
    }

    @Override
    public String toString() {
        return "Average";
    }
}
