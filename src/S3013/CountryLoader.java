package S3013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountryLoader {

    private final String archiveName;
    private final String delimitator;

    public CountryLoader(String archiveName, String delimitator) {
        this.archiveName = archiveName;
        this.delimitator = delimitator;
    }

    public Map<String, String> loadCountries() {
        Map<String, String> countriesAndCapitals = new HashMap<>();

        try (BufferedReader countriesReader = new BufferedReader(new FileReader(archiveName))) {
            String line;
            while ((line = countriesReader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(delimitator, 2);
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();
                        countriesAndCapitals.put(key, value);
                    } else {
                        System.out.println("Map attributes must be 2 (Country & Capital)");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading countries file", e);
        }

        return countriesAndCapitals;
    }
}
