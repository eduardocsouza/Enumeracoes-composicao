package entites;

import entites.enuns.Dias;

public class EnumTest {
	
	Dias dia;
	
	
	public EnumTest(Dias dia) {
		this.dia = dia;
	}
	
	public void enumDia() {
		
		switch(dia) {
		
		case SEGUNDA:
			System.out.println("Segunda � um dia RUIM!");
			break;
		
		case TERCA:
			System.out.println("Ter�a ainda � ruim!");
			break;
		
		case QUARTA:
			System.out.println("come�a a mellhorar!");
			break;
			
		case QUINTA:
			System.out.println("Boa!");
			break;
			
		case SEXTA:
			System.out.println("�TIMO DIA!!!!");
			break;
			
		default:
			System.out.println("erro!");
			break;
		}		
		
	}
	
	

}
