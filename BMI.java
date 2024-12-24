
package bmi;
import java.util.Scanner;

public class BMI {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter value of your weight in Kg");
        double weight = input.nextDouble();
        System.out.println("please enter value of your height in meters");
        double height =input.nextDouble();
        
        double BMI = (weight) / (height * height);
       if (BMI <18.5){
           System.out.println("You are under weight");
       }else if (18.5 <= BMI){
           System.out.println("Your are normal"); 
       }else if (BMI < 25.0)  {
           System.out.println("you are narmal");
       }else if (BMI >= 25.0)  {
           System.out.println("you are owerweight");
       }else if (BMI < 30.0)  {
           System.out.println("you are owerweight");
       }else if (BMI >= 30.0) {
           System.out.println("you are obese");
                   
       }
    
    }
    
}
