/*
*  Write a method named mostCommonNames that accepts as its parameter a Scanner
* for an input file whose data is a sequence of lines, where each line contains 
* a set of first names separated by spaces. Your method should print the name 
* that occurs the most frequently in each line of the file. The method should 
* also return the total number of unique names that were seen in the file. You
* may assume that no name appears on more than one line of the file.
*
* Each line should be considered separately from the others. On a given line, 
* some names are repeated; all occurrences of a given name will appear consecutively
* in the file. If two or more names occur the same number of times, print the one 
* that appears earlier in the file. If every single name on a given line is different,
* every name will have 1 occurrence, so you should just print the first name in the file.
*/

public static int mostCommonNames(Scanner input) {
    int uniqueName = 0;
    
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        String last = console.next();
        uniqueName++;
        String commonWord = last;
        int mostCommon = 1;
        int count = 1;
        
        while (console.hasNext()) {
            String current = console.next();
            if (current.equals(last)) {
                count++;
            } else {
                if (count > mostCommon) {
                    mostCommon = count;
                    commonWord = last;     
                }
                count = 1;
                uniqueName++;
            }
            last = current;
        }
        if (count > mostCommon) {
            commonWord = last;
        }
        System.out.println("Most common: " + commonWord);
    }
    
    return uniqueName;
}
