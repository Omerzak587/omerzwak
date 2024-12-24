
package jhw14;

import java.util.Scanner;


public class Jhw14 {

   
    public static void main(String[] args) {
           Scanner Sc = new Scanner(System.in);
 double P, R = 0, T, SI, simplelnterest;
        System.out.println("enter the value of P");
        P = Sc.nextDouble();
        System.out.println("enter the value of T ");
        T = Sc.nextDouble();
        System.out.println("enter the value of R ");
        R = Sc.nextDouble();
        SI = (P * R * T) / 100;
        answer14:
        System.out.println("the value of  SI = " + SI);
    }
    
}
