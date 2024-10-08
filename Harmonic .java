public class Harmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double harmonicNumber = harmonic(n);
        System.out.println("Harmonic number for n = " + n + ": " + harmonicNumber);
    }

    public static double harmonic(int n) {
        if (n < 100) {
            return harmonicSmall(n);
        } else {
            return harmonicLarge(n);
        }
    }

    public static double harmonicSmall(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static double harmonicLarge(int n) {
        return Math.log(n) + 0.5772156649;  // Euler's constant approximation
    }
}
