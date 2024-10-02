package org.example;


public class Main {
    public static  void main(String[] args) {

        //Точки с координатами
       Point p1 = new Point(1,3);
       Point p2 = new Point(2, 6);
       Point p3 = new Point(12, 60);

       // Расстояние между двумя точками
        System.out.println(p1.distance(p2));

        // Периметр треугольника
       TriangleMy triangleMy = new TriangleMy(p1, p2, p3);
       System.out.println("Периметр треугольника " +  triangleMy.per());

       // Вичисление площади треугольников из массива trs
       TriangleMy[] trs = {new TriangleMy(p1,p2, p3), new TriangleMy(new Point(99, 100),
                 new Point(20, 77), new Point(8, 12))};

       for (TriangleMy t: trs)
           System.out.println("Для точек вершин треугольника (x,y); "
                   + t.getPoints(t) + " периметр = " +  t.toString());

       Circle circle = new Circle(new Point(10, 10), 10);
       System.out.println("Длинна окружности = " + circle.pCircle());
       System.out.println("Площадь окружности = " + circle.sCircle());
       System.out.println("Пересекаются? " + circle.isIntersection(
               new Circle(new Point(0, 0), 20),
               new Circle(new Point(10, 0), 20) ));






    }
}