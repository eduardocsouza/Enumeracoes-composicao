package application;

import java.util.Date;

import entites.Order;
import entites.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(32, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		OrderStatus os = OrderStatus.PENDING_PAYMENT;//carrega a variável os com o valor enum PENDING_PAYMENT.
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");//os2 recebe o valor "SHIPPED" que se trata de um enum.
		
		System.out.println(os);
		System.out.println(os2);
	}
}
