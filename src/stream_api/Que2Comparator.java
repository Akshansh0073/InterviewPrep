package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Que2Comparator {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(1, 2, 3, 45, 62, 61, 4, 3, 22, 6, 73);
		Comparator<? super Integer> comparator = (a, b) -> a.compareTo(b);
		Integer integer = list1.stream().max(comparator).get();
		System.out.println(integer);

		Employee e1 = new Employee("Akshansh", 40, 750000);
		Employee e2 = new Employee("Divyansh", 26, 150000);
		Employee e3 = new Employee("Rajesh", 29, 250000);
		List<Employee> l1 = new ArrayList();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		Collections.sort(l1);
//		System.out.println(l1);

		Comparator<Employee> ageComparator = (a1, a2) -> Integer.compare(a1.getSalary(), a2.getSalary());
		List<Employee> collect = l1.stream().sorted(ageComparator).collect(Collectors.toList());
		System.out.println(collect);
	}

}
