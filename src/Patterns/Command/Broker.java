package Patterns.Command;

import java.util.List;
import java.util.ArrayList;

public class Broker {
	private List<Order> orderList = new ArrayList<>();
	
	public void takeOrder(Order order){
		this.orderList.add(order);
	}
	
	public void placeOrders(){
		for (Order order : this.orderList)
			order.execute();
		this.orderList.clear();
	}
}
