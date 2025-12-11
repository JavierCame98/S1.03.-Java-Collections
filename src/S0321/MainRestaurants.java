package S0321;

import java.util.HashSet;
import java.util.Set;

public class MainRestaurants {

    public static void main(String[] args) {
        Set<Restaurant> listOfRestaurants = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Cinc sentits", 95);
        Restaurant restaurant2 = new Restaurant("Cinc sentits", 100);
        Restaurant restaurant3 = new Restaurant("Bulli", 80);
        Restaurant restaurant4 = new Restaurant("El seller de Can Roca", 80);
        Restaurant duplicatedRestaurant = new Restaurant("Bulli", 80);

        listOfRestaurants.add(restaurant1);
        listOfRestaurants.add(restaurant2);
        listOfRestaurants.add(restaurant3);
        listOfRestaurants.add(restaurant4);
        listOfRestaurants.add(duplicatedRestaurant);


        System.out.println(listOfRestaurants);

    }




}
