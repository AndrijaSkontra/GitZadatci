package zadatak1.model;

public class Exponent implements Calculation{
    @Override
    public float calculate(float firstNum, float secondNum) {

        float result;
        System.out.println("Casting -> " + secondNum + " to int type!");
        int secondNumInt = (int) secondNum;
        result = (float) Math.pow(firstNum, secondNumInt);

        return result;
    }

    @Override
    public String symbol() {
        return "^";
    }

    @Override
    public String toString() {
        return "Exponent";
    }
}
