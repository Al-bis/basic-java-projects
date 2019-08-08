package pl.coderstrust.figures;

class Triangle implements Figure {

    private double base;
    private double height;

    Triangle(double base, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be lower or equal 0");
        }
        if (base <= 0) {
            throw new IllegalArgumentException("Base cannot be lower or equal 0");
        }
        this.base = base;
        this.height = height;
    }

    double getBase() {
        return base;
    }

    void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base cannot be lower or equal 0");
        }
        this.base = base;
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
