package entites;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valeuPerHour;
	private Integer hours;
	
	
	public HourContract(Date date, Double valeuPerHour, Integer hours) {
		this.date = date;
		this.valeuPerHour = valeuPerHour;
		this.hours = hours;
	}	
		
	public Date getDate() {
		return date;
	}

	public Double getValeuPerHour() {
		return valeuPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public Double totalValeu() {
		return valeuPerHour * hours;
	}
	
	
}
