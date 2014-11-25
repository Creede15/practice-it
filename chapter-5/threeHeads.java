/*
* Write a method named threeHeads that repeatedly flips a coin until
* three heads in a row are seen. You should use a Random object to 
* give an equal chance to a head or a tail appearing. Each time the
* coin is flipped, what is seen is displayed (H for heads, T for 
* tails). When 3 heads in a row are flipped a congratulatory message
* is printed. 
*/

public static void threeHeads() {
    Random random = new Random();
    int numOfHead = 0;
    
    while (numOfHead < 3) {
        int hOrT = random.nextInt(2);
        if (hOrT == 1) {
            System.out.print("H ");
            numOfHead++;
        } else {
            System.out.print("T ");
            numOfHead = 0;
        }
    }
    
    System.out.println();
    System.out.println("Three heads in a row!");
}
