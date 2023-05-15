import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator(){
        Scanner input = new Scanner(System.in);
        Calculator calculator = null;

        boolean exit = false;
        while (!exit) {
            Calculator.tittle();
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Fibonacci Calculator");
            System.out.print("Select operation (press x to exit) : ");

            switch (input.next()){
                case "1":
                    calculator  = new BasicCalculator(999);
                    break;
                case "2":
                    calculator  = new ScientificCalculator(999);
                    break;
                case "3":
                    calculator  = new FibonacciCalculator(999);
                    break;
                case "x":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            if (calculator != null && !exit) {
                calculator.menu();
            }
        }
    }
}