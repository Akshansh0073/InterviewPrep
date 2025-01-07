package InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafeIterator {

    public static void main(String[] args) {

//        List<Integer> listPlans = new ArrayList<Integer>();
        List<Integer> listPlans = new CopyOnWriteArrayList<>(); // fail safe give copy of collection
        listPlans.add(1000);
        listPlans.add(2000);
        listPlans.add(3000);

        Iterator<Integer> iterator = listPlans.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            listPlans.add(1000);
        }
    }
}
