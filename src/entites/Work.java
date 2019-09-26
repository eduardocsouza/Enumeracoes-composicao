package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enuns.WorkLevel;

public class Work {

	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	private List<HourContract> list = new ArrayList<>();
	private Department dep;
	
	public Work(String name, WorkLevel level, Double baseSalary, Department dep) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.dep = dep;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkLevel getLevel() {
		return level;
	}
	public void setLevel(WorkLevel level) {
		this.level = level;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public List<HourContract> getList() {
		return list;
	}
	
	public void addContract(HourContract contract) {
		list.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		list.remove(contract);
	}
	
	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : list) {
			cal.setTime(c.getDate());
			int yearC = cal.get(Calendar.YEAR);
			int monthC = 1 + cal.get(Calendar.MONTH);
			
			if(year == yearC && month == monthC) {
				sum += c.totalValeu();
			}
		}
		
		return sum;
	}
	
	
}
