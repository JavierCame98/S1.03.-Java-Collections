package S3013;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
                    }
                }
                countriesAndCapitals.put(key, value);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(countriesAndCapitals);
    }
}
