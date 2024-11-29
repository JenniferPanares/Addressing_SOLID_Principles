package main.java.Solid.Violated.LSP


// Violates LSP because the Square class overrides behavior in Rectangle in a way
// that changes the expected behavior of the parent class.

public class Rectangle {
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

    public double getArea() {
        return width * height; // Area = width * height
    }
}


public class Square extends Rectangle {
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side); // Changes both width and height to maintain a square
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side); // Changes both width and height to maintain a square
    }
}

