public class FibonacciCalculator extends Calculator{

    public FibonacciCalculator(int arrayLength){
        super(arrayLength);
    }

    //POLYMORPHISM
    public static void tittle(){
        System.out.println("\n=== Fibonacci Calculator ===");
    }

    //ABSTRACTION METHOD
    @Override
    public void menu(){
        boolean done = false;
        while (!done){
            tittle();
            System.out.println("1. Fibonacci N");
            System.out.println("2. Fibonacci Squence");
            System.out.print("Select operation (press x to cancel) : ");

            String operation = input.next();

            switch (operation){
                case "1":
                    System.out.print("Enter number n: ");
                    setNumber(0, input.nextDouble());
                    int result = fibonacciN((int) getNumbers()[0]);

                    setResult((double) result);
                    System.out.println("\n F(" + (int) getNumbers()[0] + ") = " + (int) getResult());
                    clear();
                    break;
                case "2":
                    fibonacciSquence();
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

    private int fibonacciN(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacciN(n - 1) + fibonacciN(n - 2);
    }

    private void fibonacciSquence(){
        System.out.print("Enter start of Fibonacci sequence : ");
        int start = input.nextInt();
        System.out.print("Enter end of Fibonacci sequence : ");
        int end = input.nextInt();
        int index = 0;

        for (int i = start; i <= end; i++){
            setNumber(index, (double) fibonacciN(i));
            index++;
        }

        System.out.print("\n F(" + start + "-" + end + ") = ");

        for(int i = 0; i < index; i++){
            System.out.print((int) getNumbers()[i] + (i == index - 1 ? "\n" : ", "));
        }
    }
}
