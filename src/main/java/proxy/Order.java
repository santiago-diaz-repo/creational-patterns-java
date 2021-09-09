package proxy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;

    public Order(String... items){
        this.items = new ArrayList<>();

        for(String item: items){
            this.items.add(item);
        }
    }

    public List<String> getItems(){
        return this.items;
    }
}
