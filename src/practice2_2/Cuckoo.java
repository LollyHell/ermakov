package practice2_2;

public class Cuckoo extends Birds {
    public Cuckoo() {
    }

    @Override
    public String sing() {
        String res = "";
        int max = 10;
        int min = 1;
        int ranCount = (int)(Math.random() * (max - min+1)) + min;
        for (int i = 0; i < ranCount; i++) {
            res+= "Ку-ку ";
        }
        return res;
    }
}
