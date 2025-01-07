package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Que4MergeTwoArray {

	public static void main(String[] args) {
		
		// 1. merger
		int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};
         
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
         
        System.out.println(Arrays.toString(c));
         
        // 2 reverse order
        List.of(1,3,2,1,3).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        // 3 remove duplicates
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");  
        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrngs);
        
        List<Integer> a1 = List.of(1,3,2,1,3).stream().distinct().collect(Collectors.toList());
        System.out.println(a1);
        
        // 4 count use
        long count = List.of(1,3,2,1,3).stream().filter(c1 -> c1==3).count();
        System.out.println(count);
        
        //5 Anagram String
        String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        if (s1.equals(s2)) 
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
    }

}

