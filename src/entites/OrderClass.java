package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.enuns.OrderStatus;

public class OrderClass {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public OrderClass() {
	}

	public OrderClass(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem x : orderItem) {
			sum += x.subTotal();
		}
		
		return sum;
	}
	
	@Override	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client);
		sb.append(" ");
		sb.append("Order items: " + "\n");
		for(OrderItem c : orderItem) {
			sb.append(c + "\n");
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));			
		return sb.toString();
		
	}
	
	
}
