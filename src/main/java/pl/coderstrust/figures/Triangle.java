package pl.coderstrust.figures;

public class Triangle implements Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (height <= 0 || base <= 0) {
            throw new IllegalArgumentException("Arguments cannot be lower or equals 0");
        }
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Argument cannot be lower or equals 0");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Arguments cannot be lower or equals 0");
        }
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
