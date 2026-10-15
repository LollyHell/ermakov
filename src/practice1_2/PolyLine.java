package practice1_2;

import practice1_1.Point;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1.3.2 Ломаная линия. Создайте сущность Ломаная,
// которая будет представлять собой ломаную линию (см. пример на рис.1.13).
// Ломаная линия представляет собой набор следующих характеристик:
//•	Имеет массив Точек (из задачи 1.1.1), через которые линия проходит.
//•	Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”,
// где TN – это результат приведения к строке Точки с номером N
//Необходимо выполнить следующие задачи:
//1.	Создать первую Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}
//2.	Создайте вторую Ломаную, чья первая и последняя Точка совпадает с
// таковыми у первой Ломаной, но в качестве середины имеет точки: {2,-5}, {4,-8}
//3.	Сдвиньте начало первой Ломаной таким образом, чтобы одновременно сдвинулось
// начало второй Ломаной.
public class PolyLine {
//    public Point[] bl;
    List<Point> points;

    public PolyLine(){
        this.points = new ArrayList<>();
    }
    public PolyLine(Point[] points) {
        this(new ArrayList<Point> (Arrays.asList(points)));

    }

    public  PolyLine(ArrayList<Point> points){
        this.points = new ArrayList<>();
        this.points.addAll(points);
    }

    public  PolyLine(PolyLine polyLine){
        this((ArrayList<Point>) polyLine.points);
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    public void setPoints(List<Point> points) {
        if (points.size() < 2){
            throw  new IllegalArgumentException("Длина ломаной линии должна быть более 1 точки");
        }
        this.points = new ArrayList<> (points);
    }

    public void addPoint(Point... newPoints){
        if (newPoints == null) return;
        for (Point p : newPoints){
            this.points.add(p);
        }
    }

    public List<Point> toNormolizedPoints() {
        return new ArrayList<>(this.points);
    }
    public  double len() {
        List<Point> points = toNormolizedPoints();
        double sum = 0;
       for (int i = 0; i < points.size()-1; i++){
           Line l = new Line(points.get(i), points.get(i+1));
           sum += l.len();
       }
       return sum;
    }
    @Override
    public String toString() {
        return "Линия " + points;
    }
}

