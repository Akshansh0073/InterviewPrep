package stream_api;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReusingStream {

	public static void main(String[] args) {
		String name[] = { "ankit", "anmol", "aniket", "deepu", "ranu", "anmol" };
		long count = Arrays.asList(name).stream().filter(str -> str.equals("anmol")).count();
		System.out.println(count);
	}

}
