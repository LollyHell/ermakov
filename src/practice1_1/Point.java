package practice1_1;

import java.util.List;

public sealed class Point implements Cloneable permits Point3D{
    /**
     * Класс для представления точки на двумерной координатной плоскости
     * <p>
     * Точка определяется двумя целочисленными координатами: X и Y
     * Предоставляет метод для получения текстового представления координат в формате "{X;Y}"
     * </p>
     */
    protected int[] coords;
    private List<Property> property;
    /**
     * координата X
     */
    private int x;
    /**
     * координата Y
     */
    private int y;


    public Point(Point p){

        coords = p.coords.clone();


    }
    public Point(int x, int y) {
        coords = new int[2];
        coords[0] = x;
        coords[1] = y;
    }

    public int getX() {
        return coords[0];
    }

    public void setX(int x) {
        coords[0] = x;
    }

    public int getY() {
        return coords[1];
    }

    public void setY(int y) {
        coords[1] = y;
    }


    /**
     * Конструктор по умолчанию класса Point
     */
    public Point() {
    }

    /**
     * возвращает текстовое представление координат
     * @return  строка вида {X,Y}
     */
    @Override
    public String toString(){
        return("{" + coords[0] + ";" + coords[1] +"}" );
    }
}
