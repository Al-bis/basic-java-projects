package pl.coderstrust.figures;

public class Rectangle implements Figure {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Arguments cannot be lower or equals 0");
        }
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Argument cannot be lower or equals 0");
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Argument cannot be lower or equals 0");
        }
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
