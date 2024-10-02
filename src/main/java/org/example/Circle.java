package org.example;

public class Circle {
    //центр окружности
    Point p;
    double r;
    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }
    public double pCircle(){
        return Math.PI * 2 * r;
    }
    public double sCircle(){
        return Math.PI * Math.pow(r, 2);
    }
    public Point getPoint(){
        return this.p;
    }
    public boolean isIntersection(Circle a, Circle b){
        //растояние между точками
        Point a1 = a.getPoint();
        Point b1 = b.getPoint();
        //Растояние между центрами
        double d = a1.distance(b1);
        //Если растояние между точками меньше или равно суммам радиусов, то
        //окружности пересекаются или касаются

        return (d <= a.r + b.r);
    }
}
