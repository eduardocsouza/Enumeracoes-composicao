package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Department;
import entites.HourContract;
import entites.Work;
import entites.enuns.WorkLevel;

public class ProgramExercicio {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name:");
		String nameDep = sc.next();		
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.println("Base salary: ");
		double bs = sc.nextDouble();
		Work work = new Work(name, WorkLevel.valueOf(level), bs, new Department(nameDep));
		
		System.out.print("How many contract to this worker? "); 
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valeu = sc.nextDouble();
			System.out.print("Duration (hour): ");
			int hours = sc.nextInt();
			work.addContract(new HourContract(data, valeu, hours));
			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String yearAndMonth = sc.next();
		int year = Integer.parseInt(yearAndMonth.substring(3));
		int month = Integer.parseInt(yearAndMonth.substring(0, 2));
		System.out.println("Name: " + work.getName());
		System.out.println("Department: " + work.getDep().getName());
		System.out.printf("Income: %.2f", work.income(year, month));
		
		sc.close();
	}

}
