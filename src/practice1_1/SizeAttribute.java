package practice1_1;

public  class SizeAttribute extends Attribute {
    public SizeAttribute(Integer value) {
        super("size", value);
    }
    @Override
    public Integer getValue(){
        return (Integer) super.getValue();
    }
}
