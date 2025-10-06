package metrics;

import java.io.FileWriter;
import java.io.IOException;

public class PerformanceTracker {

    public static void writeToCSV(String algorithm, int n, long time, int comparisons, int swaps) {
        try (FileWriter writer = new FileWriter("metrics.csv", true)) {
            writer.append(algorithm + "," + n + "," + time + "," + comparisons + "," + swaps + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
