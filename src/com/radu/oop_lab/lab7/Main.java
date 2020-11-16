package com.radu.oop_lab.lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Figure square = new Square(4,8);
        Figure rectangle = new Rectangle(3,9);
        Figure triangle = new Triangle(2,5);

        List<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);

        System.out.println("The biggest area - " + FigureController.getBiggestArea(figures).getArea());
        System.out.println("The biggest perimeter - " + FigureController.getBiggestPerimeter(figures).getPerimeter());

        Figure circle = new Figure() {
            private float area = 100;
            private float perimeter = 100;

            @Override
            float getArea() {
                return area;
            }

            @Override
            float getPerimeter() {
                return perimeter;
            }
        };

        System.out.println("\n\nCircle area - " + circle.getArea());
        System.out.println("Perimeter area - " + circle.getPerimeter());

        figures.add(circle);

        System.out.println("\n\nWith circle:");
        System.out.println("The biggest area - " + FigureController.getBiggestArea(figures).getArea());
        System.out.println("The biggest perimeter - " + FigureController.getBiggestPerimeter(figures).getPerimeter());

    }
}
