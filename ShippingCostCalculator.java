import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ask for the package details
        System.out.print("Enter the package weight in kilograms: ");
        double weight = in.nextDouble();
        System.out.print("Enter the shipping rate per kilogram: ");
        double rate = in.nextDouble();

        // cost is weight times rate
        double shippingCost = weight * rate;

        System.out.println("Shipping Cost: " + shippingCost + " USD");
    }
}
