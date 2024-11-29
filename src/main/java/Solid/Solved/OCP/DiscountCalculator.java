package main.java.Solid.Solved.OCP;

// Interface defining the contract for different types of discounts
public interface IDiscount {

    double Calculate();
}

// Class for RegularDiscount
public class RegularDiscount implements IDiscount {

    public double Calculate() {
        return 0.1; // 10% discount
    }
}

// Class for PremiumDiscount
public class PremiumDiscount implements IDiscount {

    public double Calculate() {
        return 0.2; // 20% discount
    }
}

// DiscountCalculator class that works with any implementation of IDiscount
public class DiscountCalculator {

    public double CalculateDiscount(IDiscount discountType) {
        return discountType.Calculate();
    }
}

// Adhere to OCP. This makes the code open for extension (new discount types) but closed for modification
// (no need to alter DiscountCalculator when adding new discounts).