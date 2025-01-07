package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// 1
		Stream<Object> empty = Stream.empty();
		empty.forEach(s -> System.out.println(s));

		// 2
		String name[] = { "ankit", "anmol", "aniket", "deepu", "ranu" };
		List<String> collect = Stream.of(name).filter(c -> c.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);

		// 3
		Stream<Object> stream = Stream.builder().build();

		// 4
		IntStream stream2 = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		stream2.forEach(e -> System.out.print(e + " "));
	}
}
