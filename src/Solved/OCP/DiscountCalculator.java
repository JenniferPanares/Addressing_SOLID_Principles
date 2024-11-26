package Solved.OCP.com.solid.ocp.solved;

public interface IDiscount
{
    double Calculate();
}

public class RegularDiscount : IDiscount
{
    public double Calculate() => 0.1; // 10% discount
}

public class PremiumDiscount : IDiscount
{
    public double Calculate() => 0.2; // 20% discount
}

public class DiscountCalculator
{
    public double CalculateDiscount(IDiscount discountType)
    {
        return discountType.Calculate();
    }
}
