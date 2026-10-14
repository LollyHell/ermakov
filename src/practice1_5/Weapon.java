package practice1_5;
//Практика
//2.2.1 Оружие. Измените сущность Пистолет, полученную в задаче 1.6.5
// таким образом, чтобы она наследовалась от класса Weapon описанного на рисунке 2.10.
abstract class Weapon {
    private int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    abstract String shoot();

    public int ammo() { return ammo; }

    public boolean getAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return false;
    }

    public int load(int ammo) {
        if (ammo < 0) {
            throw new RuntimeException();
        }
        int tmp = ammo;
        this.ammo = ammo;
        return tmp;
    }

}

