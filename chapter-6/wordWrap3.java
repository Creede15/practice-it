/*
* Modify the preceding wordWrap method into a new wordWrap3 method that wraps
* only whole words, never chopping a word in half. Assume that a word is any
* whitespace-separated token and that all words are under 60 characters in
* length. Make sure that each time you wrap a line, the subsequent wrapped 
* line(s) each begin with a word and not with any leading whitespace. Accept
* only a single parameter for the input Scanner, and send your method's output
* to the console, as in the original wordWrap problem; do not use an output
* file as was done in wordWrap2. 
*/

public static void wordWrap3(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        
        while (line.length() > 60) {
            if (line.charAt(60) == ' ') {
                System.out.println(line.substring(0, 60));
                line = line.substring(61);
            } else {
                int index = line.substring(0, 60).lastIndexOf(" ");
                System.out.println(line.substring(0, index));
                line = line.substring(index + 1);
            }
        }
        
        System.out.println(line);
    }
}
