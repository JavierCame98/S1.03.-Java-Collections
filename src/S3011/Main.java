package S3011;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> monthsList = new ArrayList<>();

        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month("April");
        Month month5 = new Month("May");
        Month month6 = new Month("June");
        Month month7 = new Month("July");
        Month month9 = new Month("September");
        Month month10 = new Month("October");
        Month month11 = new Month("November");
        Month month12 = new Month("December");


        monthsList.add(month1);
        monthsList.add(month2);
        monthsList.add(month3);
        monthsList.add(month4);
        monthsList.add(month5);
        monthsList.add(month6);
        monthsList.add(month7);
        monthsList.add(month9);
        monthsList.add(month10);
        monthsList.add(month11);
        monthsList.add(month12);

        Month month8 = new Month("August");
        monthsList.add(7,month8);

        for(Month month : monthsList){
            System.out.println(month.getName());
        }


        Set<Month> arrayListToHashSet = new HashSet<>(monthsList);
        arrayListToHashSet.add(month7);
        arrayListToHashSet.add(month8);

        System.out.println("HashSet list without duplicated" + arrayListToHashSet);

        for(int i = 0; i < monthsList.size(); i++){
            Month month = monthsList.get(i);
            System.out.println(month.getName());
        }


        Iterator<Month> iterator = monthsList.iterator();

        while(iterator.hasNext()){
            Month month = iterator.next();
            System.out.println(month);
        }











    }
}
