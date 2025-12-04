package S3011;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> monthsList = new ArrayList<>(List.of( // mirar GitHUb crear array list inicializadno valor EstherBlackSmith
                new Month("January"),
                new Month("February"),
                new Month("March"),
                new Month("April"),
                new Month("May"),
                new Month("June"),
                new Month("July"),
                new Month("September"),
                new Month("October"),
                new Month("November"),
                new Month("December")
        ));

        System.out.println("##Adding August in it's position");

        Month month8 = new Month("August");
        monthsList.add(7,month8);

        for(Month month : monthsList){
            System.out.println(month.getName());
        }

        System.out.println("##Converting the Array List to HasSet List");

        Set<Month> arrayListToHashSet = new HashSet<>(monthsList);
        Month month7 = monthsList.get(6);
        boolean duplicatedMonth = arrayListToHashSet.add(month7);


        System.out.println("##HashSet list without duplicated" + arrayListToHashSet);
        System.out.println("##The Hash set doesn't add duplicatedmonth " + duplicatedMonth);

        System.out.println("##Scrolling through the list with for loop");

        for(int i = 0; i < monthsList.size(); i++){
            Month month = monthsList.get(i);
            System.out.println(month.getName());
        }

        System.out.println("##Scrolling through the list with an iterator");

        Iterator<Month> iterator = monthsList.iterator();

        iterator.forEachRemaining(month -> System.out.println(month.getName()));

    }
}
