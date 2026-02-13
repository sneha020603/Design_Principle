package DesignPrinciple;

interface TwoDimensionalShape {
    double area();
}

interface ThreeDimensionalShape {
    double volume();
}

class Square implements TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double area() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }
}

public class SegregatedInterfacesExample {
    
    public static void main(String[] args) {
        
        TwoDimensionalShape square = new Square(4);
        System.out.println("Area of Square: " + square.area());

        Cube cube = new Cube(3);
        System.out.println("Surface Area of Cube: " + cube.area());
        System.out.println("Volume of Cube: " + cube.volume());
    }
}
