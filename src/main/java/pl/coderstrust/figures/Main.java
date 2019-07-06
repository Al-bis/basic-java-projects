package pl.coderstrust.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(12.5));
        figures.add(new Rectangle(4.6, 8.9));
        figures.add(new Square(8.4));
        figures.add(new Trapezoid(4.3, 6.1, 5.3));
        figures.add(new Triangle(6.6, 3.7));
        for (Figure figure : figures) {
            System.out.println(figure + String.format("  - has area: %.2f", figure.calculateArea()));
        }
    }
}
