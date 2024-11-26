package Violated.OCP;

public class DiscountCalculator
{
    public double CalculateDiscount(string userType)
    {
        if (userType == "Regular")
        {
            return 0.1; // 10% discount
        }
        else if (userType == "Premium")
        {
            return 0.2; // 20% discount
        }
        else
        {
            return 0.0; // No discount
        }
    }
}
