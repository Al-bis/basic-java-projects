package pl.coderstrust.figures;

class Rectangle implements Figure {

    private double height;
    private double width;

    Rectangle(double height, double width) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be lower or equal 0");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be lower or equal 0");
        }
        this.height = height;
        this.width = width;
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

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be lower or equal 0");
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
