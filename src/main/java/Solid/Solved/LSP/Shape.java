package main.java.Solid.Solved.LSP;

// Abstract class Shape defines a contract for all shapes
public abstract class Shape {
    public abstract double getArea();
}

// Rectangle class represents a rectangle with independent width and height
public class Rectangle extends Shape {
    private double width;
    private double height;


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    // Implements getArea for a rectangle
    @Override
    public double getArea() {
        return width * height; // Area = Width * Height
    }
}

// Square class represents a square with a single side property
public class Square extends Shape {
    private double side;


    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    // Implements getArea for a square
    @Override
    public double getArea() {
        return side * side; // Area = Side^2
    }
}

//Adheres LSP by separating Rectangle and Square into distinct classes
// that do not interfere with each other's behavior.
