package pl.coderstrust.figures;

class Trapezoid implements Figure {

    private double lowerBase;
    private double higherBase;
    private double height;

    Trapezoid(double lowerBase, double higherBase, double height) {
        if (lowerBase <= 0) {
            throw new IllegalArgumentException("LowerBase cannot be lower or equal 0");
        }
        if (higherBase <= 0) {
            throw new IllegalArgumentException("HigherBase cannot be lower or equal 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be lower or equal 0");
        }
        this.lowerBase = lowerBase;
        this.higherBase = higherBase;
        this.height = height;
    }

    double getLowerBase() {
        return lowerBase;
    }

    void setLowerBase(double lowerBase) {
        if (lowerBase <= 0) {
            throw new IllegalArgumentException("LowerBase cannot be lower or equal 0");
        }
        this.lowerBase = lowerBase;
    }

    double getHigherBase() {
        return higherBase;
    }

    void setHigherBase(double higherBase) {
        if (higherBase <= 0) {
            throw new IllegalArgumentException("HigherBase cannot be lower or equal 0");
        }
        this.higherBase = higherBase;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be lower or equal 0");
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
