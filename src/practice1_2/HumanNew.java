package practice1_2;

public class HumanNew {
    private  NameNew name;
    private  HumanNew father;

    public HumanNew(NameNew name) {
        this.name = name;
    }

    public HumanNew(NameNew name, HumanNew father) {
        this(name);
        this.father = father;
        if (father == null){
            return;
        }
        if (this.name.getLastName().isEmpty()) {
            this.name.setLastName(getFatherLastName());
        }
        if (this.name.getMidName().isEmpty()){
            this.name.setMidName(father.getMidName());
        }
    }
    private String getFatherLastName(){
        if (father == null){
            return "";
        }
        return father.name.getLastName();
    }

    private String getMidName(){
        if (father == null){
            return "";
        }
        return father.name.getMidName();
    }

    public NameNew getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String res = this.name.toString() + " ";
        if (this.father != null){
            res += this.father.getName().getFirstName() + "ович";
        }
        return res;
    }

}
