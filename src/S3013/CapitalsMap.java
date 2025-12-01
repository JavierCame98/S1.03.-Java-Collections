package S3013;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CapitalsMap {
    public static void main(String[] args) {

        String archiveName = "countries.txt";
        String delimitator = "\\s+";

        Map<String, String> countriesAndCapitals = new HashMap<>();

        try (BufferedReader countriesReader = new BufferedReader(new FileReader(archiveName))) {
            String line;
            String key = null;
            String value = null;
            while ((line = countriesReader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(delimitator, 2);
                    if (parts.length == 2) {
                        key = parts[0].trim();
                        value = parts[1].trim();
                        System.out.println("Country: " + key + ", Captial: " + value);
                        countriesAndCapitals.put(key, value);
                    }else{
                        System.out.println("Map attributes has to be 2 (Country & Capital");
                    }
                }


            }
            System.out.println("Actual size of the map is " + countriesAndCapitals.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Random rnd = new Random();
        System.out.println(pickRandomCountry(countriesAndCapitals, rnd));


    }

    public static String pickRandomCountry (Map<String, String> countriesAndCapitals, Random rnd) {
        String pickedCountry = "";
        if (countriesAndCapitals.isEmpty()) {
            System.out.println("To pick a country there must be countries on the list");
        } else {
            List<String> countryList = new ArrayList<>(countriesAndCapitals.keySet());
            int randomIndex = rnd.nextInt(countriesAndCapitals.size());
            pickedCountry = countryList.get(randomIndex);


        }
        return pickedCountry;
    }
}
