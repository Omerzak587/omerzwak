
package chinesezodiac;
import java.util.Scanner;
public class Chinesezodiac {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year to check");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("The entered year is Monkey");
                break;
            case 1:
                System.out.println("The entered year is Rooster");
                break;
            case 2:
                System.out.println("The entered year is Dog");
                break;
            case 3:
                System.out.println("The entered year is Pig");
                break;
            case 4:
                System.out.println("The entered year is Rat");
                break;
            case 5:
                System.out.println("The entered year is Ox");
                break;
            case 6:
                System.out.println("The entered year is Tiger");
                break;
            case 7:
                System.out.println("The entered year is Rabbit");
                break;
            case 8:
                System.out.println("The entered year is Dragon");
                break;
            case 9:
                System.out.println("The entered year is Snake");
                break;
            case 10:
                System.out.println("The entered year is Horse");
                break;
            case 11:
                System.out.println("The entered year is Sheep");
                break;
        }
    }
    
}
