package practice1_2;

import practice1_1.FullName;
import practice1_1.Human;

//1.2.3 Человек с родителем. Измените сущность Человек из задачи 1.2.2
// добавив ему возможность задавать третий параметр: Отец, где Отец — это тоже Человек.
//При приведении человека к строковой форме необходимо выполнить следующие действия:
//•	Личное имя берется по прежним правилам
//•	Если Фамилия в Имени НЕ указана, то вместо неё используется Фамилия Отца. Если Отец не указан,
// или не имеет Фамилии, то Фамилия в строковой форме не участвует.
//•	Если Отчество в Имени не указано, то вместо неё используется Имя Отца с добавлением окончания
// “-ович”. Если Отец не указан, или не имеет Имени, то Имя в строковой форме не участвует
//•	Исключите информацию о росте Человека из строковой формы.
//Обратите внимание, что никакие действия, выполняемые при приведении к строке, не должны повлиять
// не изменение состояния текущего объекта.
//
//Необходимо выполнить следующие задачи:
//1.	Создать людей: Чудова Ивана, Чудова Петра, Бориса
//2.	Сделать Ивана отцом Петра, а Петра отцом Бориса
//3.	Вывести на экран строковое представление всех троих людей.
public class Father {
    public FullName name;
    public Father father;

    public  Father(FullName name, Father father){
        this.father = father;
        this.name = name;
    }
    public Father(FullName name){
        this.name = name;
    }
    @Override
    public String toString(){
        String resPatronymic = "";
        String resSurname = "";
        if (this.name.patronymic != null){
            resPatronymic = this.name.patronymic;
        } else {
            if (father != null && father.name.name != null) {
                resPatronymic = father.name.name + "ович";
            }
        }
        if (this.name.surname != null){
            resSurname = this.name.surname;
        }else{
            if (father != null && father.name.surname != null){
                resSurname = father.name.surname;
            }
        }
        return (this.name.name + " "+ resPatronymic+ " "+ resSurname);
    }
}
