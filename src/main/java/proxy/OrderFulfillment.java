package proxy;

import java.util.ArrayList;
import java.util.List;

public class OrderFulfillment implements IOrder{

    private List<Warehouse> warehouseList;

    public OrderFulfillment() {
        this.warehouseList = new ArrayList<>();
        for(int i=0; i < 3; i++)
            this.warehouseList.add(new Warehouse(String.valueOf(i)));
    }

    @Override
    public void fulfillOrder(Order order) {
        System.out.println("Executing from OrderFulfillment");
        for(Warehouse warehouse: this.warehouseList){
            for(String item: order.getItems()){
                if(warehouse.currentInventory(item)> 0){
                    warehouse.fulfillOrder(order);
                }
            }
        }
    }
}
