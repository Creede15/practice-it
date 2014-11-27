/*
* Write a method named inputStats that takes a Scanner representing a file 
* as a parameter and that reports various statistics about the file's text.
* In particular, your method should report the number of lines in the file, 
* the longest line, the number of tokens on each line, and the length of 
* the longest token on each line. You may assume that the input file has at
* least one line of input and that each line has at least one token.
*/

public static void inputStats(Scanner input) {
    int lineNum = 0;
    int longestLine = 0;
    String longestString = "";
    
    while (input.hasNextLine()) {
        lineNum++;
        String line = input.nextLine();
        if (line.length() > longestLine) {
            longestLine = line.length();
            longestString = line;
        }
        int token = 0;
        int longest = 0;
        Scanner console = new Scanner(line);
        
        while (console.hasNext()) {
            token++;
            String word = console.next();
            if (word.length() > longest) {
                longest = word.length();
            }
        }
        System.out.printf("Line %d has %d tokens (longest = %d)\n", lineNum, token, longest);
    }
    
    System.out.println("Longest line: " + longestString);
}
