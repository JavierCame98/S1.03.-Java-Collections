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
        String delimitator = " ";

        Map<String, String> countriesAndCapitals = new HashMap<>();

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(archiveName))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                if (!line.trim().isEmpty() && line.contains(delimitator)) {
                    String[] parts = line.split(delimitator, 2);
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(countriesAndCapitals);
    }
}
