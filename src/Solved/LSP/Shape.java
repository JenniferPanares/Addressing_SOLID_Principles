package Solved.LSP.com.solid.lsp.solved;

public abstract class Shape
{
    public abstract double GetArea();
}

public class Rectangle : Shape
{
    public double Width { get; set; }
    public double Height { get; set; }
    public override double GetArea() => Width * Height;
}

public class Square : Shape
{
    public double Side { get; set; }
    public override double GetArea() => Side * Side;
}
// ADHERES TO LSP: Separate classes with consistent behavior
