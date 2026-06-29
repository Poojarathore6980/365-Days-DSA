class Solution {

    int MOD = 1000000007;

    public int numPrimeArrangements(int n) {

        int primeCount = 0;

        // Count prime numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        int nonPrimeCount = n - primeCount;

        long primeFact = factorial(primeCount);
        long nonPrimeFact = factorial(nonPrimeCount);

        return (int)((primeFact * nonPrimeFact) % MOD);
    }

    // Function to check if a number is prime
    public boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    // Function to calculate factorial modulo MOD
    public long factorial(int n) {

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MOD;
        }

        return fact;
    }
}