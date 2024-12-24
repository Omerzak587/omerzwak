
package computinganglesofatriangle;
import java.util.Scanner;

public class ComputingAnglesofaTriangle {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value of x1 ");
        double x1 = input.nextInt();

        System.out.println("Please enter the value of y1 ");
        double y1 = input.nextInt();

        System.out.println("Please enter the value of x2 ");
        double x2 = input.nextInt();

        System.out.println("Please enter the value of y2 ");
        double y2 = input.nextInt();

        System.out.println("Please enter the value of x3 ");
        double x3 = input.nextInt();

        System.out.println("Please enter the value of y3 ");
        double y3 = input.nextInt();

        double a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));

        double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));

        double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));

        System.out.println("The value of Angle A is = " + A);
        System.out.println("The value of Angle B is = " + B);
        System.out.println("The value of Angle C is = " + C);

    } 
    }
    

