package pl.coderstrust.figures;

public class Trapezoid implements Figure {

    private double lowerBase;
    private double higherBase;
    private double height;

    public Trapezoid() {
    }

    public Trapezoid(double lowerBase, double higherBase, double height) {
        this.lowerBase = lowerBase;
        this.higherBase = higherBase;
        this.height = height;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    public double getHigherBase() {
        return higherBase;
    }

    public void setHigherBase(double higherBase) {
        this.higherBase = higherBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
