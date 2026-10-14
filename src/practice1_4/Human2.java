package practice1_4;

import practice1_2.NameNew;

public class Human2 {
    private NameNew name;
    private Human2 father;

    public Human2(NameNew name, Human2 father) {
        this.name = name;
        this.father = father;
    }

    public Human2(String strName){
        this(new NameNew(null, strName, null), null);
    }

    public Human2(NameNew name){
        this(name, null);
    }

    public Human2(String strName, Human2 father){
        this(new NameNew(null, strName, null), father);
    }

    @Override
    public String toString() {
        String res = this.name.toString();
        if (father != null){
            res+= this.father;
        }
        return res;
    }
}
