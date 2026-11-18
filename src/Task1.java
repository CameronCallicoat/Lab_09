import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }


        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int dataPoint : dataPoints) {
            sum += dataPoint;

            if (dataPoint < min) {
                min = dataPoint;
            }
            if (dataPoint > max) {
                max = dataPoint;
            }
        }

        double average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);
    }
}

