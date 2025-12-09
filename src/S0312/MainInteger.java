package S0312;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainInteger {
    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>(List.of(1,2,3,4));

        System.out.println("The first List order is: " + integerList1);
        List<Integer> integerList2 = new ArrayList<>();
        ListIterator<Integer> integerListIterator = integerList1.listIterator(integerList1.size());

        while(integerListIterator.hasPrevious()){
            int reverseNumber = integerListIterator.previous();
            integerList2.add(reverseNumber);
        }

        System.out.println("The second List reverse order is: " + integerList2);

    }
}
