package InterviewQuestions;


import java.util.ArrayList;
import java.util.List;

class GenericBox <T>{
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class Generics {
    public static void main(String[] args) {

//        LegacyBox legacyBox = new LegacyBox();
//        legacyBox.setItem("Hello, World!");

        // The following line will cause a compile-time error
        // String s = (String) legacyBox.getItem();

        // Using Generics to fix the compile-time error
        GenericBox<String> genericBox = new GenericBox<>("Hello, World!");
        String s = genericBox.getItem();
        

        System.out.println(s);
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);

        List<Double> list1 = List.of(1.1, 2.0, 3.2, 4.2);
        Double a1 = findMax(list1);
        System.out.println(a1);
        
    }

    private static <T extends Number & Comparable<T>> T findMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
