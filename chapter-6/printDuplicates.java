/*
* Write a method named printDuplicates that accepts as its parameter a Scanner 
* for an input file containing a series of lines. Your method should examine
* each line looking for consecutive occurrences of the same token on the same
* line and print each duplicated token along how many times it appears 
* consecutively. Non-repeated tokens are not printed. Repetition across multiple
* lines (such as if a line ends with a given token and the next line starts with 
* the same token) is not considered in this problem. 
*/

public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        String last = console.next();
        int count = 1;
        
        while (console.hasNext()) {
            String current = console.next();
            if (last.equals(current)) {
                count++;
            } else {
                if (count > 1) {
                    System.out.print(last + "*" + count + " ");
                }
                count = 1;
            }
            last = current;
        }
        
        if (count > 1) {
            System.out.print(last + "*" + count + " ");
        }
        System.out.println();
    }
}
