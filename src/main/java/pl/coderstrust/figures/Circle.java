package pl.coderstrust.figures;

class Circle implements Figure {

    private double radius;

    Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be lower or equal 0");
        }
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be lower or equal 0");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
