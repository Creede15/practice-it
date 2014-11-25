/* 
* Write a method named randomWalk that performs a random one-dimensional walk,
* reporting each position reached and the maximum position reached during the 
* walk. The random walk should begin at position 0. On each step, you should 
* ither increase or decrease the position by 1 (with equal probability). The
* walk stops when 3 or -3 is hit.
*/

public static void randomWalk() {
    int position = 0;
    int maxPost = -3;
    System.out.println("position = " + position);
    Random random = new Random();
    
    while (position != 3 && position != -3) {
        int step = random.nextInt(2);
        if (step == 0) {
            step--;
        }
        position += step;
        System.out.println("position = " + position);
        if (position > maxPost) {
            maxPost = position;
        }
    }
    
    System.out.println("max position = " + maxPost);
}
