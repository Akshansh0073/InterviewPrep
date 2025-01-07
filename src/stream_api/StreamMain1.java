package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {

	public static void main(String[] args) {

		// create a list and filter all even numbers
		List<Integer> list1 = List.of(1, 2, 3, 45, 62, 61, 4, 3, 22, 6, 73);

//		list1.add(12);

		// 2
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(342);
		list2.add(1);
		list2.add(22);
		list2.add(24);
		list2.add(43);
		list2.add(234);

		// 3
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 3, 2, 4, 56, 7);

		// 4
		String[] str = { "akshansh", "divyansh", "rajesh", "akshansh" };
		long count = Arrays.asList(str).stream().filter(a -> "akshansh".equals(a)).count();
		System.out.println(count);

		List<Integer> collect = list1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collect2 = list1.stream().filter(n -> n > 50).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
