/*
* Write a method priceIsRight that accepts an array of integers bids and an integer price 
* as parameters. The method returns the element in the bids array that is closest in 
* value to price without being larger than price. 
*/

public static int priceIsRight(int[] bids, int price) {
    int difference = 1000000000;
    int bid = 0;
    
    for (int i = 0; i < bids.length; i++) {
        if (bids[i] <= price) {
            if (price - bids[i] < difference) {
                bid = bids[i];
                difference = price - bids[i];
            }
        }
    }
    
    if (bid == 0) {
        return -1;
    } else {
        return bid;
    }
}
