public class ReverseArray {
    public static void main(String[] args) {
   
        String[] arr = new String[]{"Hello", "World","Java"};

     
        System.out.println("Original array:");
        printArray(arr);

       
        String[] reversedArr = reverse(arr);

     
        System.out.println("\nArray in reverse order:");
        printArray(reversedArr);
    }

 
    public static String[] reverse(String[] arr) {
       
        String[] reversedArr = new String[arr.length];

       
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

     
        return reversedArr;
    }

   
    public static void printArray(String[] arr) {
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
