import java.util.*;

public class MaxMin {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int i = 0, sum = 0, length = 0;
        int arr[] = new int[100];

        System.out.println("Enter the array elements: (Give any char to stop)");
        while (inp.hasNext()) {
            if (inp.hasNextInt()) {
                arr[i] = inp.nextInt();
                i++;
            } else {
                break;
            }
        }

        length = i;

        int max_element = arr[0], min_element = arr[0];
        for (i = 0; i < length; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }

            if (arr[i] < min_element) {  // Checking Minimum element
                min_element = arr[i];
            }
        }

        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);
    }
}
