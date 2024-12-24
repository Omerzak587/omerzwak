
package dollar.amount;
import java.util.Scanner;
public class DollarAmount {

 
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println("Please enter dollar amount");
        double dUnit = input.nextDouble();
        int dUnitInteger = (int) dUnit;
        double dUnitDecimal = dUnit - dUnitInteger;

        double quater, dimmes, nickle, pennies;

        quater = dUnitInteger * 4d;
        dimmes = dUnitInteger * 10d;
        nickle = dUnitInteger * 100d;
        pennies = dUnitInteger * 5d;
        
        System.out.println("The amount in quater is  " + quater);
        System.out.println("The amount in dimmes is  " + dimmes);
        System.out.println("The amount in nickle is  " + nickle);
        System.out.println("The amount in pennies is  " + pennies);

    }

}

 