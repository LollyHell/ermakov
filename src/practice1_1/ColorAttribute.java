package practice1_1;

public class ColorAttribute extends Attribute {
    public ColorAttribute(String value) {
        super("color", value);
    }
    @Override
    public String getValue(){
        return (String) super.getValue();
    }

}
