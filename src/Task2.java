import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
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

        int searchVal = InputHelper.getRangedInt(in, "\nEnter a value to search for", 1, 100);
        int count = 0;

        for (int dataPoint : dataPoints) {
            if (dataPoint == searchVal) {
                count++;
            }
        }

        System.out.println("The value " + searchVal + " was found " + count + " times in dataPoints.");

        int findVal = InputHelper.getRangedInt(in, "\nEnter another value to find its first position", 1, 100);
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == findVal) {
                System.out.println("The value " + findVal + " was found at array index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + findVal + " was not found in dataPoints.");
        }
    }
}
