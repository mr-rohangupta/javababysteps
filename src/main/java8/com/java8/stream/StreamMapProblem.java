package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapProblem
{
	public static void main(String[] args)
	{

		Employee employee1 = new Employee();
		employee1.setName("Mr A");
		employee1.setSalary(123000l);

		Employee employee2 = new Employee();
		employee2.setName("Mr X");
		employee2.setSalary(123000l);


		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);

		/*final Map<Long, String> xyz =
				employeeList.stream().collect(Collectors.toMap(Employee::getSalary, Employee::getName));*/

		final Map<Long, String> xyz =
				employeeList.stream().collect(Collectors.toMap(Employee::getSalary, Employee::getName, (e1, e2) -> {
					return e2;
				}));
		System.out.println(xyz);

	}

}


class Employee {
	private String name;
	private Long salary;


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getSalary()
	{
		return salary;
	}

	public void setSalary(Long salary)
	{
		this.salary = salary;
	}
}