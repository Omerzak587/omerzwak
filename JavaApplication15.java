
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
        System.out.println("please inter a vaiue for raduis");
        double raduis = input.nextDouble() ;
        if (raduis >=0) {
            double area = 3.14 * raduis * raduis;
            System.out.println("The area is" + area);
        }
    }
    
}
