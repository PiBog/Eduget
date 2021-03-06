package example.Exsample1.Calculate;

import java.util.Scanner;

/**
 * Class of the calculator start with user input
 */
public class IteractRunner {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            Calculator calc = new Calculator();
            String exit = "n";
            while (!exit.equals("y")) {
                System.out.println("Enter first argument");
                int first = Integer.parseInt(reader.next());
                System.out.println("Enter second argument");
                int second = Integer.parseInt(reader.next());
                //calculate
                calc.operSelector(first, second);
                //shows result
                System.out.println("Result" + calc.getResult());
                calc.clearResult();
                System.out.println("Exit? : (y/n)");
                exit = reader.next();
            }
        }

    }
}
