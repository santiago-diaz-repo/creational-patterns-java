package prototype;

public abstract class Prototype {
    private String attr1;
    private String attr2;
    private int attr3;

    public Prototype(String attr1,String attr2, int attr3){
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }

    public Prototype(Prototype p){
        if(p != null){
            System.out.println("Invoking creation");
            this.attr1 = p.attr1;
            this.attr2 = p.attr2;
            this.attr3 = p.attr3;
        }
    }

    public abstract Prototype clone();

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public int getAttr3() {
        return attr3;
    }

    public void setAttr3(int attr3) {
        this.attr3 = attr3;
    }

    @Override
    public String toString(){
        return this.attr1 + " " + this.attr2 + " " +this.attr3 ;
    }
}
