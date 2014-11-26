/*
* Write a method named countCoins that accepts as its parameter a Scanner for an
* input file whose data represents a person's money grouped into stacks of coins.
* Your method should add up the cash values of all the coins and print the total 
* money at the end. The input consists of a series of pairs of tokens, where each
* pair begins with an integer and is followed by the type of coin, which will be 
* either "pennies" (1 cent each), "nickels" (5 cents each), "dimes" (10 cents each),
* or "quarters" (25 cents each), case-insensitively. A given coin might appear more 
* than once on the same line. 
* You may assume that the file contains at least 1 pair of tokens. You may also assume
* that the input is valid; that the input has an even number of tokens, that every 
* other token is an integer, and that the others are valid coin types. 
*/

public static void countCoins(Scanner console) {
    int cents = 0;
    
    while (console.hasNext()) {
        int coin = console.nextInt();
        String money = console.next().toLowerCase();
        if (money.equals("pennies")) {
            cents += coin * 1;
        } else if (money.equals("nickels")) {
            cents += coin * 5;
        } else if (money.equals("dimes")) {
            cents += coin * 10;
        } else {
            cents += coin * 25;
        }
    }
    
    if (cents % 100 < 10) {
        System.out.printf("Total money: $%d.0%d\n", cents / 100, cents % 100);
    } else {
        System.out.printf("Total money: $%d.%d\n", cents / 100, cents % 100);
    }
}
