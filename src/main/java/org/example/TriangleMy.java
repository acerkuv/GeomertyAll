package org.example;

public class TriangleMy {
    Point p1, p2, p3;
    public TriangleMy(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double per(){
        double s1 = p1.distance(p2);
        double s2 = p1.distance(p3);
        double s3= p2.distance(p3);
        return s1 + s2 + s3;
    }
    @Override
    public String toString(){
        return Double.toString(per());
    }

    public String getPoints(TriangleMy triangleMy){

        return p1.getPoint() + p2.getPoint() + p3.getPoint();
    }
}
