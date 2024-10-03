public class ReverseArrayInPlace {
    public static void main(String[] args) {
        String[] array = {"Coimbatore", "RVSCAS", "to", "Welcome"};
        int length = array.length;
        
        for (int i = 0; i < length / 2; i++) {
            String temp = array[length - i - 1];
            array[length - i - 1] = array[i];
            array[i] = temp;
        }
        
        for (int i = 0; i < array.length; i++) {
            String element = array[i];
            System.out.println(element);
        }
    }
}
