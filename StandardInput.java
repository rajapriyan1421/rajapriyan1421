import java.io.*;
import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        double mean = sum / n;
        double sum2 = 0.0;

        for (int i = 0; i < n; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }

        double stddev = Math.sqrt(sum2 / (n - 1));

        System.out.println("Mean: " + mean);
        System.out.println("Sample standard deviation: " + stddev);
    }
}
