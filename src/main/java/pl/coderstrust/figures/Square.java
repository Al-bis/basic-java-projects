package pl.coderstrust.figures;

public class Square extends Rectangle implements Figure {

    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setLength(double length) {
        side = length;
    }

    @Override
    public void setWidth(double width) {
        side = width;
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
