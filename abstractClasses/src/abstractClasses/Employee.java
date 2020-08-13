package abstractClasses;

import java.time.*;

public class Employee extends Person {

	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year,int month,int day)
	{
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	public double getSalary()
	{
		return salary;
	}
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	public String getDiscription()
	{
		return String.format("Pracownik %s zarabiający %.2f" , getName(),salary);
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent;
		salary += raise;
	}
}
