 public class BasicCalculator extends Calculator {

    private int index = 0;

    public BasicCalculator(int arrayLength){
        super(arrayLength);
    }

     //POLYMORPHISM
     public static void tittle(){
         System.out.println("\n=== Basic Calculator ===");
     }


     private void setNumbers(){
        boolean done = false;
        this.index = 0;

        do{
            System.out.print("Enter number (press x to calculate) : ");
            String number = input.nextLine();
            if (number.equals("x")){
                done = true;
            }else{
                setNumber(this.index, Double.parseDouble(number));
                this.index++;
            }
        }while (!done);
    }

     //ABSTRACTION METHOD
    @Override
    public void menu(){
        boolean done = false;
        while (!done){
            tittle();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplycation");
            System.out.println("4. Division");
            System.out.print("Select operation (press x to cancel : ");

            String operation = input.nextLine();

            switch (operation){
                case "1":
                    add();
                    clear();
                    break;
                case "2":
                    subtract();
                    clear();
                    break;
                case "3":
                    multiply();
                    clear();
                    break;
                case "4":
                    divide();
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

    private void add() {
        setNumbers();
        double result = getNumbers()[0];
        System.out.print("\n"+result);

        for (int i = 1; i < this.index; i++){
            result += getNumbers()[i];
            System.out.print(" + " + getNumbers()[i]);
        }

        setResult(result);
        System.out.println(" = " + getResult());
    }

    private void subtract() {
        setNumbers();
        double result = getNumbers()[0];
        System.out.print("\n"+result);

        for (int i = 1; i < this.index; i++){
            result -= getNumbers()[i];
            System.out.print(" - " + getNumbers()[i]);
        }

        setResult(result);
        System.out.println(" = " + getResult());
    }

    private void multiply() {
        setNumbers();
        double result = getNumbers()[0];
        System.out.print("\n"+result);

        for (int i = 1; i < this.index; i++){
            result *= getNumbers()[i];
            System.out.print(" x " + getNumbers()[i]);
        }

        setResult(result);
        System.out.println(" = " + getResult());
    }

    private void divide() {
        setNumbers();
        double result = getNumbers()[0];
        System.out.print("\n"+result);

        for (int i = 1; i < this.index; i++){
            result /= getNumbers()[i];
            System.out.print(" : " + getNumbers()[i]);
        }

        setResult(result);
        System.out.println(" = " + getResult());
    }

}
