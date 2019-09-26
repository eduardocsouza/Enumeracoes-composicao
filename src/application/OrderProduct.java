package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Client;
import entites.OrderClass;
import entites.OrderItem;
import entites.Product;
import entites.enuns.OrderStatus;

public class OrderProduct {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		OrderClass orderClass = new OrderClass(new Date(), OrderStatus.valueOf(status), new Client(name, email, date));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProd = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem items = new OrderItem(quantity, price, new Product(nameProd, price));
			orderClass.addItem(items);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(orderClass);
		
		sc.close();
	}

}
