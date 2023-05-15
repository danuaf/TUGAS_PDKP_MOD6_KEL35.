import java.util.Scanner;

//ABSTRACTION CLASS
public abstract class Calculator {

    //ENCAPSULATION USING PUBLIC AND PRIVATE ACCESS MODIFIER
    public Scanner input = new Scanner(System.in);
    private double[] numbers;
    private int arrayLength;
    private double result;

    public Calculator(int arrayLength){
        this.numbers = new double[arrayLength];
        this.arrayLength = arrayLength;
        this.result = 0;
    }

    //POLYMORPHISM
    public static void tittle(){
        System.out.println("\n=== Calculator ===");
    }

    //GETTER
    public double[] getNumbers() {
        return numbers;
    }

    //GETTER
    public double getResult(){
        return result;
    }

    //SETTER
    public void setNumber(int index, double number) {
        this.numbers[index] = number;
    }

    //SETTER
    public void setResult(double result){
        this.result = result;
    }

    //CLEAR METHOD
    public void clear() {
        numbers = new double[this.arrayLength];
        result = 0;
    }

    //ABSTRACTION METHOD
    public abstract void menu();

}

