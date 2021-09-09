package proxy;

import java.util.HashMap;

public class Warehouse implements IOrder{

    private HashMap<String, Integer> stock;
    private String address;

    public Warehouse(String address){
        this.stock = new HashMap<>();
        this.address = address;

        this.stock.put("something", 4);
        this.stock.put("somethingElse", 9);
    }

    @Override
    public void fulfillOrder(Order order) {
        System.out.println("Executing from Warehouse");
        //do something to send the order
    }

    public Integer currentInventory(String item){
        return this.stock.get(item);
    }
}
