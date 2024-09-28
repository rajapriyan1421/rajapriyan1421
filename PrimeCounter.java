public class  PrimeCounter
{
    public static void main(String args[]) 
    {
        int n = Integer.parseInt(args[0]);  // Get the value of n from the first argument
        int i, j, count, primeCount = 0;

        for (j = 1; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }

            if (count == 2) {  // If the number has exactly 2 divisors, it is prime
                System.out.println(j);  // Print the prime number
                primeCount++;  // Increment the prime counter
            }
        }

        System.out.println("The number of prime numbers up to " + n + " is: " + primeCount);
    }
}
