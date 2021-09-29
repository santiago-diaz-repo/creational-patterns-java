package prototype;

import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void testPrototype(){
        Prototype p1 = new PrototypeImpl("A","B",2,"C");

        System.out.println(p1.getAttr1());
        System.out.println(p1.getAttr2());
        System.out.println(p1.getAttr3());
        System.out.println(p1);

        PrototypeImpl p2 = (PrototypeImpl) p1.clone();

        p1.setAttr1("NEW");
        System.out.println(p1.getAttr1());

        System.out.println(p2.getAttr1());
        System.out.println(p2.getAttr2());
        System.out.println(p2.getAttr3());
        System.out.println(p2);

    }
}
