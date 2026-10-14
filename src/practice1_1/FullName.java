package practice1_1;
/**
 * Класс для представления сущности "Имя", содержащей фамилию, личное имя и отчество
 * <p>
 * Поддерживает формирование полного имени в формате "Фамилия Имя Отчество"
 * Параметры могут быть не заданы (null), в этом случае они пропускаются
 * </p>
 */
public class FullName {
    /**
     * ФИО человека
     */
    public String name;
    public String surname;
    public String patronymic;
    /**
     * Конструктор по умолчанию класса FullName
     */
    public FullName() {}

    /**
     * Возвращает текстовое представление полного имени
     * <p>
     * Склеивает непустые компоненты (фамилию, имя, отчество)
     * </p>
     *
     * @return строка с полным именем ("Пушкин Александр Сергеевич" или "Клеопатра")
     */

    @Override
    public String toString(){
        String res = "";
        if (surname != null){
            res += surname + " ";
        }
        if (name != null){
            res += name + " ";
        }

        if (patronymic != null){
            res += patronymic + " ";
        }

        return(res);
    }
}
