package pl.coderstrust.figures;

public class Trapezoid implements Figure {

    private double lowerBase;
    private double higherBase;
    private double height;

    public Trapezoid(double lowerBase, double higherBase, double height) {
        if (lowerBase <= 0 || higherBase <= 0 || height <= 0) {
            throw new IllegalArgumentException("Arguments cannot be lower or equals 0");
        }
        this.lowerBase = lowerBase;
        this.higherBase = higherBase;
        this.height = height;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        if (lowerBase <= 0) {
            throw new IllegalArgumentException("Argument cannot be lower or equals 0");
        }
        this.lowerBase = lowerBase;
    }

    public double getHigherBase() {
        return higherBase;
    }

    public void setHigherBase(double higherBase) {
        if (higherBase <= 0) {
            throw new IllegalArgumentException("Argument cannot be lower or equals 0");
        }
        this.higherBase = higherBase;
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

    @Override
    public double calculateArea() {
        return ((lowerBase + higherBase) / 2) * height;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "lowerBase=" + lowerBase +
                ", higherBase=" + higherBase +
                ", height=" + height +
                '}';
    }
}
