package pl.coderstrust.figures;

public class Square implements Figure {

    private double side = 0;

    public Square(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
