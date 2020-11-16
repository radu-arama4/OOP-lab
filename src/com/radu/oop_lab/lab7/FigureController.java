package com.radu.oop_lab.lab7;

import java.util.List;

public class FigureController {
    static public Figure getBiggestArea(List<Figure> figures){
        int max=0;
        Figure maxFig = null;
        for(Figure f:figures){
            if(f.getArea()>max){
                maxFig=f;
            }
        }
        return maxFig;
    }

    static public Figure getBiggestPerimeter(List<Figure> figures){
        int max=0;
        Figure maxFig = null;
        for(Figure f:figures){
            if(f.getPerimeter()>max){
                maxFig=f;
            }
        }
        return maxFig;
    }
}
