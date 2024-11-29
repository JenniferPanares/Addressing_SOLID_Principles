package main.java.Solid.Violated.OCP;

// Violates OCP because adding a new user type requires modifying
// the CalculateDiscount method.
public class DiscountCalculator {
    public double calculateDiscount(String userType) {
        if (userType.equals("Regular")) {
            return 0.1; // 10% discount
        } else if (userType.equals("Premium")) {
            return 0.2; // 20% discount
        } else {
            return 0.0; // No discount
        }
    }
}
