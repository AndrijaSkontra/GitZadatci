package zadatak1.model;

public abstract class Calculator {

    protected Calculation calculation;

    protected void display(float number) {
        System.out.println("Result is: " + number + " -- Operation is: " + calculation.getClass().getSimpleName());
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    protected abstract float performCalculation(float firstNum, float secondNum);
}
