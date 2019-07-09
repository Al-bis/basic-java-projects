package pl.coderstrust.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(3.33));
        figures.add(new Rectangle(3.33, 3.33));
        figures.add(new Square(3.33));
        figures.add(new Trapezoid(3.33, 3.33, 3.33));
        figures.add(new Triangle(3.33, 3.33));
        for (Figure figure : figures) {
            System.out.println(figure + String.format("  - has area: %.2f", figure.calculateArea()) + "\u33A0");
        }
    }
}
