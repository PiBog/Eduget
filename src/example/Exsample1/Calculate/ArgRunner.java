package example.Exsample1.Calculate;

import java.util.Scanner;

/**
 * Class of the calculator start with command line input
 */
public class ArgRunner {

//  Создать класс Calculator.
// 	Добавить два класса клиента ArgRunner и InteractRunner. ArgRunner: данные берутся из параметров
//  запуска программы. InteractRunner: данные вводит пользователь.
// 	Добавить возможность выборки операции, валидацию, повторное использование результата вычисления.

    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        try (Scanner reader = new Scanner(System.in)) {
            Calculator calc = new Calculator();
            String exit = "n";
            while (!exit.equals("y")) {
                System.out.println("Please, select operation(1.\"+\";2.\"-\";3.\"*\";4.\"/\";5.\"^\"):");
                int selector = Integer.parseInt(reader.next());
                switch (selector) :{
                    case 1:
                        calc.add(first, second);
                        break;
                    case 2:
                        calc
                }
            }

            System.out.println("Result" + calc.getResult());
            calc.clearResult();
            System.out.println("Exit? : (y/n)");
            exit = reader.next();
        }
    }

}

}
