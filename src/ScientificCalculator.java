public class ScientificCalculator extends Calculator {

    public ScientificCalculator(int arrayLength){
        super(arrayLength);
    }

    //POLYMORPHISM
    public static void tittle(){
        System.out.println("\n=== Scientific Calculator ===");
    }

    //ABSTRACTION METHOD
    @Override
    public void menu(){
        boolean done = false;
        while (!done){
            tittle();
            System.out.println("1. Square Root");
            System.out.println("2. Exponentiation");
            System.out.println("3. Factorial");
            System.out.println("4. Logarithm");
            System.out.print("Select operation (press x to cancel) : ");

            String operation = input.next();

            switch (operation){
                case "1":
                    squareRoot();
                    clear();
                    break;
                case "2":
                    exponentiation();
                    clear();
                    break;
                case "3":
                    factorial();
                    clear();
                    break;
                case "4":
                    log();
                    clear();
                    break;
                case "x":
                    done = true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

    private void squareRoot() {
        System.out.print("Enter number : ");
        setNumber(0, input.nextDouble());

        setResult(Math.sqrt(getNumbers()[0]));
        System.out.println("\n√" + getNumbers()[0] + " = " + getResult());
    }

    private void exponentiation() {
        System.out.print("Enter number (e^x) e : ");
        setNumber(0, input.nextDouble());
        System.out.print("Enter number (e^x) x : ");
        setNumber(2, input.nextDouble());

        setResult(Math.pow(getNumbers()[0], getNumbers()[1]));
        System.out.println("\n" + getNumbers()[0] + "^" + getNumbers()[1] + " = " + getResult());
    }

    private void factorial() {
        System.out.print("Enter number : ");
        setNumber(0, input.nextDouble());
        int n = (int) getNumbers()[0];
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        setResult(factorial);
        System.out.println("\n" + n + "! = " + getResult());
    }

    private void log(){
        System.out.print("Enter number : ");
        setNumber(0, input.nextDouble());

        setResult(Math.log(getNumbers()[0]));
        System.out.println("\nlog " + getNumbers()[0] + " = " + getResult());
    }
}
