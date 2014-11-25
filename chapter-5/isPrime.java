/*
* The following method attempts to examine a number and return whether that number is prime 
*/

public static boolean isPrime(int n) {
    boolean prime = true;
    
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            prime = false;
        }
    }
    
    return prime;
}
