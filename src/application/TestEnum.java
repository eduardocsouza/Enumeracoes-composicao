package application;

import java.util.Scanner;

import entites.EnumTest;
import entites.enuns.Dias;

public class TestEnum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana: ");
		String dia = sc.nextLine();
				
		Dias teste = Dias.valueOf(dia);
		EnumTest et = new EnumTest(teste);
		et.enumDia();
		
		
		sc.close();
	}

}
