
package celsius;

import java.util.Scanner;
public class Celsius {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double fahrenheit ,celsius;
        
        System.out.println("Enter value for fahrenheit");
        fahrenheit = input.nextDouble();
        
        celsius = (5.0/9)*(fahrenheit-32);
        
        System.out.println("The value of celsius is  "+celsius ); 
    }
    
}
