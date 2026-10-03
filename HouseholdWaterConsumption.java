import java.util.Scanner;

public class HouseholdWaterConsumption {

    
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter morning water usage (litres): ");
        int morningUsage = sc.nextInt();

        
        System.out.print("Enter evening water usage (litres): ");
        int eveningUsage = sc.nextInt();

        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        
        System.out.println("\nTotal Water Consumption: " + totalConsumption + " litres");

        sc.close();
    }
}
