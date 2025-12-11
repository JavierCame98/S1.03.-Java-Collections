package S3013;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreRepository {

    public static void saveScore(String username, int score) {
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
