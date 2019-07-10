package pl.coderstrust.figures;

public class Rectangle implements Figure {

    private double height = 0;
    private double width = 0;

    public Rectangle(double height, double width) {
        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
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
