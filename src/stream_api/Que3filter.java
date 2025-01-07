package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Que3filter {

	public static void main(String[] args) {

		Employee e1 = new Employee("Akshansh", 40, 750000);
		Employee e2 = new Employee("Divyansh", 26, 150000);
		Employee e3 = new Employee("Rajesh", 54, 250000);
		Employee e4 = new Employee("Neeta", 23, 250000);
		Employee e5 = new Employee("Radha", 22, 250000);
		Employee e6 = new Employee("Maneesh", 45, 250000);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e6);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e1);

		Predicate<Employee> prd = e -> e.getAge() > 25;
		List<Employee> collect = list.stream().filter(prd).collect(Collectors.toList());
		System.out.println(collect);

	}
}
