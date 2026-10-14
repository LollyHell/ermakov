package practice1_2;
//1.2.4 Сотрудники и отделы. Создайте сущность Сотрудник, которая описывается:
//•	Имя: строка
//•	Отдел: включает название (строка) и начальника (Сотрудник)
//Сотрудник может быть приведен к текстовой форме вида: “Имя работает в отделе Название, начальник которого Имя”.
// В случае если сотрудник является руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
//Предусмотрите при приведении Сотрудника к строковой форме, что у Сотрудника может быть не указан отдел, название отдела, и начальник отдела.
//Необходимо выполнить следующие задачи:
//1.	Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
//2.	Сделать Козлова начальником IT отдела.
//3.	Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен оказаться один и тот же отдел и начальник).


import java.util.ArrayList;
import java.util.List;

//ИМЕЯ ссылку на отдел узнать список всех сотрудников
public class Employee {
    private String name;
    private Department department;
    public  Employee(String name){
        this(name, null);
    }
    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String getTitle() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department){

    }

    @Override
    public String toString(){
        if (department == null){
            return name;
        }
        if (department.getChief() != null && this.name.equals(department.getChief().getTitle())){
            return name + "начальник отдела " + department.getTitle();
        }
        String res = name + " работает в отделе " + department.getTitle();
        if (department.getChief() != null){
            res += ", начальник которого " + department.getChief().getTitle();
        }
        return res;
    }

//отдел для неработающих и для шефа безработного
}
