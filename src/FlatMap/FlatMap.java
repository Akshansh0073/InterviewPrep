package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));

		System.out.println("Original Nested List: " + nestedList);

		// Using flatMap without method reference
		List<Integer> flattenedList = nestedList.stream().flatMap(subList -> subList.stream()) // Flatten each sublist
																								// into a stream
				.collect(Collectors.toList()); // Collect into a single list
		// 1.
		flattenedList.stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println("Flattened List: " + flattenedList);

		// 2
		List<Integer> result = flattenedList.stream().flatMap(num -> Arrays.asList(num, -num).stream())
				.collect(Collectors.toList());
		System.out.println(result);

		// 3
		List<String> a = Arrays.asList("Hello", "World");

		List<Character> collect = a.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());

		System.out.println(collect);

		// 4
		List<String> sentences = Arrays.asList("Hello world", "The sun is shining", "Hello everyone");
		List<String> distinctWords = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
				.distinct().collect(Collectors.toList());
		System.out.println(distinctWords);

	}
}
