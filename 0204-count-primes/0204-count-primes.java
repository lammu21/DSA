class Solution {

    public int countPrimes(int n) {
        boolean[] isprime = new boolean[n + 1];

        // initialing  all number as prime 
        for (int i = 2; i <= n; i++) 
        {
            isprime[i] = true;
        }


        // Marking multiple of prime as non prime number 
        for(int p=2;p*p<=n;p++)
        {
            if(isprime[p]){
                for(int i=p*p;i<=n;i+=p){
                      isprime[i] = false;
                }
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();

        for(int i =2;i<n;i++)
        {
            if(isprime[i])
            {
              primeNumbers.add(i);
            }
        }
        
         return primeNumbers.size();
    }

    // My Approach - time Limit exceeds error

    // public int countPrimes(int n) {
    //     int count = 0;
    //     for (int i = 2; i < n; i++) {
    //         boolean isPrime = checkprime(i);
    //         if (isPrime) {
    //             count++;
    //         }
    //     }
    //     return count;

    // }

    // public static boolean checkprime(int n) {

    //     int count = 0;

    //     for (int i = 1; i * i <= n; i++) {
    //         if (n % i == 0) {
    //             count++;
    //             if (n / i != i) {
    //                 count++;
    //             }
    //         }

    //     }

    //     if (count == 2) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

}