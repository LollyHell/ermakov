package practice1_1;
/**
 * Класс для представления сущности "Дом".
 * <p>
 * Содержит информацию о количестве этажей и предоставляет метод
 * для получения текстового описания дома с правильным склонением слова "этаж"
 * </p>
 */
public class Home {
    /**
     * кол-во этажей в доме
     */
    private int floor;
    /**
     * Конструктор
     */
    public Home(int floor) {
        if (floor < 1){
            throw new IllegalArgumentException("у дома нет этажей");
        }
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    /**
     * В зависимости от кол-ва этажей, подбирает правильное склонение ("этаж" или "этажами")
     * @return строка "дом с N этажами" или "Дом с N этажом"
     */
    @Override
    public String toString(){
        String nounForm = "";
        if (floor % 10 == 1 && floor % 100 != 11){
            nounForm = "этажом";
        } else {
         nounForm = "этажами";
        }
        return ("дом с " +  floor + " " + nounForm);

    }
}
