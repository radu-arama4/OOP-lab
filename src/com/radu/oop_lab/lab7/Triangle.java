package com.radu.oop_lab.lab7;

public class Triangle extends Figure{
    private float area;
    private float perimeter;

    public Triangle(float area, float perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    float getArea() {
        return area;
    }

    @Override
    float getPerimeter() {
        return perimeter;
    }
}
