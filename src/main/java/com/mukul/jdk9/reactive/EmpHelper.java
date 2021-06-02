package com.mukul.jdk9.reactive;

import com.mukul.jdk9.reactive.Employee;
import java.util.ArrayList;
import java.util.List;


public class EmpHelper {

	public static List<Employee> getEmps() {

		Employee e1 = new Employee(1, "Rafal");
		Employee e2 = new Employee(2, "Putin");
		Employee e3 = new Employee(3, "Federer");
		Employee e4 = new Employee(4, "Novak");
		Employee e5 = new Employee(5, "Peter");

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		return emps;
	}

}
