package practice1_5;
//2.1.4 Автомат. Создайте такой подвид сущности Пистолет из задачи 1.6.5, которая будет совпадать с ней во всех отношениях, кроме следующего:
//•	Имеет скорострельность (целое число, неизменяемое) которое обозначает количество выстрелов в секунду, поддерживаемое данным автоматом. Скорострельность всегда положительное число.
//•	При вызове Стрелять количество выстрелов соответствует скорострельности (например, при скорострельности 3 выводится три строки с текстом выстрела).
//•	Умеет Стрелять N секунд, что приводит к количеству выстрелов равному N умноженное на скорострельность.
//•	Инициализация может быть выполнены следующими способами:
//a.	Без параметров. Скорострельность 30, вместимость 30.
//b.	С указанием максимального числа патронов. Скорострельность будет равна половине обоймы
//c.	С указанием максимального количества патронов в обойме и скорострельности.
public class MachineGun extends Gun{
    private final int fireRate;

    public MachineGun(){
        this(30,30);
    }
    public MachineGun(int maxAmmo) {
        this(maxAmmo, maxAmmo/2);
    }

    public MachineGun(int maxAmmo, int fireRate) {
        super(maxAmmo, maxAmmo);
        this.fireRate = fireRate;
    }

    @Override
    public String shoot(){
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < fireRate; i++) {
            sb1.append(super.shoot());
            sb1.append("\n");
        }
        return  sb1.toString();
    }

    public void fire(int seconds){
        if (seconds < 0){
            throw new IllegalArgumentException("Отрицательное кол-во секунд");
        }
        int totalShots = seconds * fireRate;
        for (int i = 0; i < totalShots; i++){
            super.shoot();
        }
    }

}
