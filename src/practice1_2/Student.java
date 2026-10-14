package practice1_2;

import java.lang.reflect.Array;
import java.util.Arrays;

//Практика
//1.3.1 Студент. Создайте сущность Студент, которая описывается:
//•	Имя: строка
//•	Оценки: массив целых чисел.
//•	Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
//Необходимо выполнить следующие задачи:
//1.	Создать студента Васю с оценками: 3,4,5.
//2.	Создать студента Петю и скопировать оценки Васи, присвоив содержимое поля с оценками Васи полю с оценками Пети.
//3.	Заменить первую оценку Пети на число 5. Вывести на экран строковое представление Васи и Пети. Объяснить результат
//4.	Создать студента Андрея и скопировать ему оценки Васи так, чтобы изменение оценок Васи не влияло на Андрея.
public class Student {
    private String name;
    private int[] grades;
    public Student(String name, int ... grades){
        this.name = name;
        this.grades = grades;
    }
    public double averageGrade(){
        if (grades == null || grades.length == 0){
            return 0;
        }
        double res = 0;
        for (int i = 0; i < grades.length; i++){
            res += grades[i];
        }
        return res/grades.length;
    }

    public boolean isExcellent(){
        if (grades == null){
            return false;
        }
        for (int i = 0; i < grades.length; i++){
            if (grades[i] != 5){
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString(){
        return (name + ":" + Arrays.toString(grades));
    }
}
