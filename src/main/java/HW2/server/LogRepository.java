package HW2.server;

import java.io.FileReader;
import java.io.FileWriter;

public class LogRepository {
    private static final String LOG_PATH = "src/main/java/HW2/log.txt";

    public void saveInLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readLog() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(LOG_PATH)) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
