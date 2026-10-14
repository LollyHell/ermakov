import practice1_1.*;
import practice1_2.*;
import practice1_4.Human2;
import practice1_5.*;
import practice2_1.ClosedPolyLine;
import practice2_1.TwoWayCity;

/**
 * Главный класс программы для запуска класса {@link ArrayUtils}
 */
public class Main {

    /**
     * Конструктор класса Main
     */
    public Main(){}
    /**
     * Запуск программы
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        //вызов метода sum
        int sum = ArrayUtils.sum();
        System.out.println(sum);

        //перевод строк в целочисленные массивы
        String []elements = {"111", "123", "34"};
        int []res = ArrayUtils.converter(elements);
        for (int i = 0; i < elements.length; i++) {
            System.out.println(res[i]);
        }

        //добавление числа в массив
        int []nums = {1, 3, 5, 9};
        int n = 7;
        int []res1 = ArrayUtils.addToArr(nums, n);
        for (int i = 0; i < res1.length; i++){
            System.out.println(res1[i]);
        }
        //сортировка массива по возрастанию суммы элементов строки
        int [][]matrix = {
            {5, 6, 7, 8},
            {1, 2, 3, 4},
            {9, 11, 12, 13},
            {14, 15, 1, 1}
        };
        int matrix_n = 4, matrix_m = 4;
        int [][]res_matrix = ArrayUtils.sortMatrix(matrix, matrix_n, matrix_m);
        System.out.println("Отсортированная матрица: ");
        for (int i = 0; i < matrix_n; i++){
            for (int j = 0; j < matrix_m; j++){
                System.out.print(res_matrix[i][j] + " ");
            }
            System.out.println();
        }

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(3);
        dynamicArray.addLast(7);
        dynamicArray.addLast(9);
        System.out.println(dynamicArray );

        dynamicArray.addLast(52);
        System.out.println(dynamicArray);

        dynamicArray.removeLast();
        System.out.println(dynamicArray);

        dynamicArray.addFirst(31);
        System.out.println(dynamicArray);

        dynamicArray.removeFirst();
        System.out.println(dynamicArray);

        dynamicArray.addTo(77, 3);
        System.out.println(dynamicArray);

        dynamicArray.removeFrom(2);
        System.out.println(dynamicArray);

        //домашки
        System.out.println("Задача 1.1.1:");
        Point p1= new Point(1,3);
        System.out.println(p1);
        Point p2 = new Point(7,9);
        System.out.println(p2);
        Point p3 = new Point(13,17);
        System.out.println(p3);

        System.out.println("Задача 1.1.2:");
        Human h1 = new Human();
        h1.name = "Клеопатра";
        h1.height = 152;
        System.out.println(h1);
        Human h2 = new Human();
        h2.name = "Пушкин";
        h2.height = 167;
        System.out.println(h2);
        Human h3 = new Human();
        h3.name = "Александр";
        h3.height = 189;
        System.out.println(h3);
        System.out.println("Задача 1.1.3:");
        FullName n1 = new FullName();
        n1.name = "Клеопатра";
        System.out.println(n1);

        FullName n2 = new FullName();
        n2.surname = "Пушкин";
        n2.name = "Александр";
        n2.patronymic = "Сергеевич";
        System.out.println(n2);

        FullName n3 = new FullName();
        n3.surname = "Маяковский";
        n3.name = "Владимир";
        System.out.println(n3);

        System.out.println("Задача 1.1.4:");
        Time t1 = new Time();
        t1.time = 10000;
        System.out.println(t1);
        Time t2 = new Time();
        t2.time = 10;
        System.out.println(t2);
        Time t3 = new Time();
        t3.time = 100000;
        System.out.println(t3);

        System.out.println("Задача 1.1.5:");
        Home home1= new Home(1);
        System.out.println(home1);
        Home home2= new Home(5);
        System.out.println(home2);
        Home home3= new Home(111);
        System.out.println(home3);
        Author turgenev = new Author("Иван Тургенев");
        Book b1 = new Book(turgenev, "Отцы и дети");
        Book b2 = new Book("Му-му");
        System.out.println(b1);
        System.out.println(b2);


        //
        Point p4 = new Point(1,3);

        Point p5 = new Point(23, 8);
        Line l1 = new Line(p4, p5);
        System.out.println(l1 );

        Point p6 = new Point(5, 10);
        Point p7 = new Point(25, 10);
        Line l2 = new Line(p6, p7);
        System.out.println(l2 );
        Line l3 = new Line(p4, p7);
        System.out.println(l3 );
        p4.setX(100);
        System.out.println(l3 );
        l1.setStart(new Point(100, 200));
        System.out.println(l3 );
        System.out.println(l3.len());
        HumanName hm1 = new HumanName(n1, h1.height);
        HumanName hm2 = new HumanName(n2, h2.height);
        HumanName hm3 = new HumanName(n3, h3.height);
        System.out.println(hm1 );
        System.out.println(hm2 );
        System.out.println(hm3 );

        FullName human = new FullName();
        human.name = "Иван";
        human.surname = "Чудов";
        Father f1 = new Father(human);
        FullName human2 = new FullName();
        human2.name = "Петр";
        human2.surname = "Чудов";
        Father f2 = new Father(human2, f1);
        FullName human3 = new FullName();
        human3.name = "Борис";
        Father f3 = new Father(human3, f2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        Employee e1 = new Employee("Козлов");
        Department d1 = new Department("IT", e1);
        Employee e2 = new Employee("Петров", d1);
        Employee e3 = new Employee("Сидоров", d1);
        System.out.println(e2);
        System.out.println(e3);

        int[]grades = {3,4,5};
        Student st1 = new Student("Васян", grades);
        System.out.println(st1);
        Student st2 = new Student("Петя", grades);
        int []copyGrades = grades.clone();
        grades[0] = 5;
        Student st3 = new Student("Андрей", copyGrades);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st3.averageGrade());
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point[]  PolyLine1 = {point1, point2, point3};
         PolyLine bl1 = new  PolyLine( PolyLine1);
        System.out.println(bl1);

        Point mid = new Point(2, -5);
        Point mid2 = new Point(4,-8);

        Point[]  PolyLine2 = {point1, mid, mid2, point2, point3};
         PolyLine bl2 = new  PolyLine( PolyLine2);
        System.out.println(bl2);


        Line l11 = new Line (new Point(1,2), new Point(4,5));


        City msc = new City("Moscow");
        City spb = new City("Saint Petersburg");
        City tvr = new City("Tver");
        msc.addRoute(spb, 380);
        msc.addRoute(tvr, 200);
        System.out.println(msc);


        NameNew name1 = new NameNew("Пушкин", "Александр", "");
        HumanNew human1 = new HumanNew(name1,  null);
        NameNew name2 = new NameNew("Пушкин", "Иван", "");
        HumanNew human22 = new HumanNew(name2, human1);
        System.out.println(human1);
        System.out.println(human22);

        Point[] pts = {new Point(), new Point(), new Point()};

        //        Human2 lev = new Human2("Лев");
//        NameNew ps = new NameNew("Пушкин", "Сергей", "");
//        Human2 ps1 = new Human2(ps, lev);
//        Human2 alex = new Human2("Александр", ps1);
//        System.out.println(lev);
//        System.out.println(ps);
//        System.out.println(alex);

        //2.1 и 2.2

        //1.5
        Gun g1 = new Gun(3);
        System.out.println(g1.shoot());
        System.out.println(g1.shoot());
        System.out.println(g1.shoot());
        System.out.println(g1.shoot());
        System.out.println(g1.shoot());

        Cat barsik = new Cat("Барсик");
        barsik.getMeow();
        barsik.getMeow(3);
        System.out.println();
        Fractions frac1 = new Fractions(2, 3);
        Fractions frac2 = new Fractions(3, 7);
        Fractions frac3 = new Fractions(1, 2);
        System.out.println(frac1 + " + " + frac2 + " = " + frac1.sum(frac2));
        System.out.println(frac1 + " - " + frac2 + " = " + frac1.minus(frac2));
        System.out.println(frac1 + " * " + frac2 + " = " + frac1.multiplication(frac2));
        System.out.println(frac1 + " / " + frac2 + " = " + frac1.division(frac2));
        Fractions frac12 = new Fractions(2, 3);
        Fractions frac22 = new Fractions(3, 7);
        Fractions frac32 = new Fractions(1, 2);

        Fractions result = frac12.sum(frac22).division(frac32).minus(5);

        System.out.println("Результат цепочки: " + result);

        Student vasya = new Student("Вася", 3,4,5,4);
        Student petya = new Student("Петя", 5,5,5,5);
        System.out.println(vasya.getName() + " средняя оценка: " + vasya.averageGrade());
        System.out.println(petya.getName() + " средняя оценка: " + petya.averageGrade());
        System.out.println(vasya.getName() + " отличник: " + vasya.isExcellent());
        System.out.println(petya.getName() + " отличник: " + petya.isExcellent());

        PolyLine pl1 = new PolyLine(new Point[] {new Point(1,5),
                new Point(2,8), new Point(5,3)});
        System.out.println("Длина ломанной: " + pl1.len());
        pl1.addPoint(new Point(5, 15), new Point(8,10));
        System.out.println("Длина ломанной: " + pl1.len());

        Square square = new Square(new Point(5, 3), 23);
        PolyLine polyLine = square.getPolyLine();
        System.out.println("Длина ломаной квадрата: " + polyLine.len());
        Point lastPoint = polyLine.getPoints().get(polyLine.getPoints().size() - 1);
        lastPoint.setX(15);
        lastPoint.setY(25);
        System.out.println("Новая длина ломаной после сдвига: " + polyLine.len());

        //2.1
        Fractions fr1 = new Fractions(1, -3);
        Fractions fr2 = new Fractions(-2, -5);

        System.out.println("1 / -3  =>  " + fr1);
        System.out.println("-2 / -5 =>  " + fr2);

        System.out.println(fr1 + " + " + fr2 + " = " + fr1.sum(fr2));
        System.out.println(fr1 + " - 2 = " + fr1.minus(2));

        Point[] points = {
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3)
        };

        PolyLine openLine = new PolyLine(points);
        PolyLine closedLine = new ClosedPolyLine(points);

        System.out.println("Обычная ломаная: " + openLine);
        System.out.println("Длина обычной ломаной: " + openLine.len());

        System.out.println("\nЗамкнутая ломаная: " + closedLine);
        System.out.println("Длина замкнутой ломаной: " + closedLine.len());

        TwoWayCity moscow = new TwoWayCity("Москва");
        TwoWayCity tula = new TwoWayCity("Тула");

        moscow.addRoute(tula, 100);

        System.out.println(moscow);
        System.out.println(tula);

        Gun g11 = new Gun(3);
        System.out.println(g11.shoot());
        System.out.println(g11.shoot());
        System.out.println(g11.shoot());
        System.out.println(g11.shoot());
        System.out.println(g11.shoot());

        MachineGun mg1 = new MachineGun();
        System.out.println("До fire: " + mg1.getAmmo());
        mg1.fire(3);
        System.out.println("После fire(3): " + mg1.getAmmo());
        System.out.println(mg1.shoot());

        mg1.reload(30);
        System.out.println("После reload(30): " + mg1.getAmmo());
        System.out.println(mg1.shoot());

        MachineGun mg2 = new MachineGun(10, 4);
        System.out.println("mg2 до fire: " + mg2.getAmmo());
        mg2.fire(3);
        System.out.println("mg2 после fire(3): " + mg2.getAmmo());
        System.out.println(mg2.shoot());

        System.out.println(sum(1, 2.5));

    }

    public static double sum(Number ... nums){
        double res = 0;
        for (int i = 0; i < nums.length; i++){
            res += nums[i].doubleValue();
        }
        return res;
    }
    public static Lengthable findMaxLine ( Lengthable ...obj){
        Lengthable maxObject = obj[0];
        double maxValue = maxObject.length();
        for (Lengthable ob : obj){
            if (maxValue < obj.length){
                maxObject = ob;
                maxValue = ob.length();
            }
        }
        return maxObject;
    }
}

interface Lengthable{
    double length();
}