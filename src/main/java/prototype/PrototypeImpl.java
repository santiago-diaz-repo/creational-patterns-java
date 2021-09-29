package prototype;

public class PrototypeImpl extends Prototype{
    private String specificAttr;

    public PrototypeImpl(String attr1,String attr2, int attr3,String specificAttr){
        super(attr1,attr2,attr3);
        this.specificAttr = specificAttr;
    }

    public PrototypeImpl(PrototypeImpl prototypeImpl){
        super(prototypeImpl);
        if(prototypeImpl != null){
            this.specificAttr = prototypeImpl.specificAttr;
        }
    }

    @Override
    public Prototype clone() {
        System.out.println("Cloning object");
        return new PrototypeImpl(this);
    }

    public String getSpecificAttr() {
        return specificAttr;
    }

    public void setSpecificAttr(String specificAttr) {
        this.specificAttr = specificAttr;
    }

    @Override
    public String toString(){
        return this.specificAttr + " ";
    }
}
