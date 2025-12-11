package S3013;

import java.util.*;

import static S3013.ScoreRepository.saveScore;

public class CapitalGame {

    private final Map<String, String> countriesAndCapitals;
    private final Random rnd;
    private int score;

    public CapitalGame(Map<String, String> countriesAndCapitals) {
        this.countriesAndCapitals = countriesAndCapitals;
        this.rnd = new Random();
        this.score = 0;
    }

    public void play(Scanner sc) {

        if(countriesAndCapitals == null || countriesAndCapitals.isEmpty()){
            System.out.println("The map is empty, you can't play");
            return;
        }

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
            throw new IllegalArgumentException("There must be a country in your list");
        } else {
            List<String> countryList = new ArrayList<>(countriesAndCapitals.keySet());
            int randomIndex = rnd.nextInt(countriesAndCapitals.size());
            pickedCountry = countryList.get(randomIndex);
        }
        return pickedCountry;
    }
}

