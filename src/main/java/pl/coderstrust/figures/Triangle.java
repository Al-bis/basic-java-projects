package pl.coderstrust.figures;

public class Triangle implements Figure {

    private double base = 0;
    private double height = 0;

    public Triangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
