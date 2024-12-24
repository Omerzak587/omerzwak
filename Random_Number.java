package random_number;

import java.util.Scanner;

public class Random_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10), number2 = (int) (Math.random() * 10);
        double sub = number1 - number2;

        double userInput;
        System.out.println("what is the result of " + number1 + "-" + number2 + "=?");
        userInput = input.nextDouble();
        if (userInput == sub) {
            System.out.println("Your answer is correct");
        } else {
            System.out.println("Your answer is wrong");
        }

    }

}
