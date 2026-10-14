package practice1_2;
import practice1_1.Point;
import java.lang.Math;
//1.2.1 Прямая Линия. Создайте сущность Линия, расположенную на двумерной плоскости, которая описывается:
//•	Координата начала: Точка
//•	Координата конца: Точка
//•	Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
//Для указания координат нужно использовать сущность Точка, разработанную в примере 1.1.1. Создайте линии со следующими характеристиками:
//1.	Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
//2.	Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
//3.	Линия 3, которая начинается всегда2 там же где начинается линия 1, и заканчивается всегда там же, где заканчивается линия 2. Таким образом, если положение первой или второй линии меняется, то меняется и третья линия.
//4.	После создания всех трех объектов измените координаты первой и второй линий, причем сделайте это таким образом, чтобы положение третьей линии соответствовало требованиям пункта 3.
//5.	Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей линии.
public class Line {
    private Point start;
    private Point end;

    public Line(Line l){
        this.start = new Point(l.start);
        this.end = new Point(l.end);
    }
    public Line(Point start, Point end){
//        this.start = new Point(start.getX(), start.getY());
//        this.end = new Point(end.getX(), end.getY());
        this(start.getX(), start.getY(), end.getX(), end.getY());
    }

    public Line(int x1, int y1, int x2, int y2){
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }
    public Point getStart() {
        return this.start;
    }

    public void setStart(Point start) {
        this.start.setX(start.getX());
        this.start.setY(start.getY());
    }
     //методы принимают 2 числа а не поинт  сеты
    public void setEnd(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }

    public void setStart(int x, int y){
        this.start.setX(x);
        this.start.setY(y);
    }

    public Point getEnd() {
        return this.end;
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public double len(){
        int c1 = (this.end.getX()- this.start.getX());
        int c2 =  (this.end.getY() - this.start.getY());
        int sum = c1*c1 + c2 * c2;
        return (Math.sqrt(sum));
    }

    @Override
    public String toString(){
        return ("Линия от "+ start + " до " + end);
    }
}
