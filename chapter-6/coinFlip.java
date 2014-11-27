/*
* Write a method named coinFlip that accepts as its parameter a Scanner for 
* an input file. Assume that the input file data represents results of sets 
* of coin flips that are either heads (H) or tails (T) in either upper or 
* lower case, separated by at least one space. Your method should consider 
* each line to be a separate set of coin flips and should output to the 
* console the number of heads and the percentage of heads in that line, 
* rounded to the nearest tenth. If this percentage is more than 50%, you 
* should print a "You win" message. 
*/

public static void coinFlip(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        int head = 0;
        int total = 0;
        
        while (console.hasNext()) {
            total++;
            if (console.next().toLowerCase().equals("h")) {
                head++;
            }
        }
        
        System.out.printf("%d heads (%.1f%%)\n", head, head * 100.0 / total);
        if (head * 100.0 / total > 50) {
            System.out.println("You win!");
        }
        System.out.println();
    }
}
