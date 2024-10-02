package org.example;

import static java.lang.Math.*;

public class Point {
    public double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String getPoint(){
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(", ").append(y).append("; ");
        return sb.toString();
    }
    public String doublePointToString(double p){
        return Double.toString(p);
    }

    public double distance(Point other){
        return sqrt(pow(x - other.x, 2) + pow(y -other.y, 2));
    }


}
