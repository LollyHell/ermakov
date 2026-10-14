package practice1_2;

import practice1_1.FullName;
import practice1_1.Human;

//1.2.2 Человек с именем. Ранее нами была реализована сущность Человек (1.1.2),
// в котором присутствовало поле для указания имени, задававшееся строкой.
// Измените тип этого поля таким образом, чтобы оно задавалось сущностью Имя из задачи 1.1.3.
//Необходимо создать и вывести на экран текстовое представление следующих людей:
//•	Человека с Именем Клеопатра и ростом 152
//•	Человека с Именем Пушкин Александр Сергеевич и ростом 167
//•	Человека с Именем Маяковский Владимир и ростом 189
public class HumanName {
    public FullName name;
    public int height;
    public HumanName(FullName name, int height){
        this.name = name;
        this.height = height;
    }
    @Override
    public String toString(){
        return ("Человек с именем " + name+ "и ростом " + height);
    }


}
