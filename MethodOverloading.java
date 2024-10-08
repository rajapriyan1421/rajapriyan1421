public class MethodOverloading {

    public static int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static double max3(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        int MaxInt = max3(10, 20, 5);
        System.out.println("Maximum value among 3 integers is = " + MaxInt);

        double MaxDouble = max3(10.5, 20.6, 50.50);
        System.out.println("Maximum value among 3 double values is = " + MaxDouble);
    }
}
