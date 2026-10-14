package practice2_1;

import practice1_1.Point;
import practice1_2.Line;
import practice1_2.PolyLine;

import java.util.ArrayList;
import java.util.List;

//2.1.2 Замкнутая ломаная. Создайте такой подвид сущности Ломанная, полученной в задаче 1.5.7,
// которая будет представлять собой замкнутую ломанную линию, то есть последовательность точек,
// начинающихся и заканчивающихся на одной и той же точке (см. рисунок 2.9). Данная сущность
// во всех отношениях совпадает с обычной Ломаной, кроме расчета длины (по очевидным причинам).
public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine() {
        super();
    }

    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    public ClosedPolyLine(ArrayList<Point> points) {
        super(points);
    }

    public ClosedPolyLine(PolyLine polyLine) {
        super(polyLine);
    }

    public List<Point> toNormolizedPoints(){
        List <Point> res = super.toNormolizedPoints();
        if (res.size() < 2){ return  res;}
        return res;
    }
}

