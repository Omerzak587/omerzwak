
package hw.pkg16;


import java.util.Scanner;


public class HW16 {

 
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    int year;
        System.out.println("enter a year :");
        year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(" is a leap year = " + year);
        }
            else { System.out.println(year + " is not a leap year ");
            
        }
    }
    
}
