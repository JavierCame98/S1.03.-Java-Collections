package S3013;

import java.io.*;
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
                        System.out.println("Country: " + key + ", Capital: " + value);
                        countriesAndCapitals.put(key, value);
                    } else {
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

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your user name?");
        String username = sc.nextLine();

        int score = 0;
        for (int i = 0; i < 10; i++) {
            String pickedCountry = pickRandomCountry(countriesAndCapitals, rnd);
            String correctCapital = countriesAndCapitals.get(pickedCountry);
            System.out.println("What's the capital of " + pickedCountry + "?");
            String userAnswer = sc.nextLine();
            if (correctCapital.equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your final score is: " + score);
        saveScore(username, score);


    }

    private static String pickRandomCountry(Map<String, String> countriesAndCapitals, Random rnd) {
        String pickedCountry = "";
        if (countriesAndCapitals.isEmpty()) {
            System.out.println("There must be a country in your list");
        } else {
            List<String> countryList = new ArrayList<>(countriesAndCapitals.keySet());
            int randomIndex = rnd.nextInt(countriesAndCapitals.size());
            pickedCountry = countryList.get(randomIndex);
        }
        return pickedCountry;
    }

    private static void saveScore(String username, int score) {
        try(
                FileWriter fw = new FileWriter("classification.txt", true);
                BufferedWriter bw = new BufferedWriter(fw))
        {
            bw.write(username + " " + score);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
