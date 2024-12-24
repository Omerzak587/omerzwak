
package lottery;

import java.util.Scanner;
public class Lottery {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int randomNumber1 = (int) (Math.random() * 10);
        int randomNumber2 = (int) (Math.random() * 10);
        int golden1, golden2;


        System.out.println("Please enter the golden1");
        golden1 = input.nextInt();

        System.out.println("Please enter the golden2");
        golden2 = input.nextInt();

        if (golden1 == randomNumber1 && golden2 == randomNumber2) {
            System.out.println("Congratulation you have won 10,000$");

        } else if (golden1 == randomNumber2 && golden2 == randomNumber1) {
            System.out.println("Congratulation you have won 3,000$");

        } else if (golden1 == randomNumber1 ^ golden2 == randomNumber2 || golden1 == randomNumber2 ^ golden2 == randomNumber1) {
            System.out.println("Congratulation you have won 1,000$");

        } else {
            System.out.println("Sorry, you have won nothing, please try again");
        }
        System.out.println(+randomNumber1 + "" + randomNumber2);
 
    }
    
}
