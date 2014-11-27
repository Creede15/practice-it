/*
* Write a method leetSpeak that accepts two parameters: a Scanner representing an input 
* file, and a PrintStream representing an output file. Your method should convert the 
* input file's text to "leet speak" (aka 1337 speak), an internet dialect where various 
* letters are replaced by other letters/numbers. Output the leet version of the text to 
* the given output file. Preserve the original line breaks from the input. Also wrap each 
* word of input in parentheses. Perform the following replacements: 
* 
*      Original character 	'Leet' character
*               o 	                 0
*        l (lowercase L) 	           1
*               e 	                 3
*               a 	                 4
*               t 	                 7
*   s (at the end of a word only) 	 Z
*/

public static void leetSpeak(Scanner input, PrintStream output) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        
        while (console.hasNext()) {
            String word = console.next();
            if (word.contains("o")) {
                word = word.replace("o", "0");
            }
            if (word.contains("l")) {
                word = word.replace("l", "1");
            }
            if (word.contains("e")) {    
                word = word.replace("e", "3");
            }
            if (word.contains("a")) {    
                word = word.replace("a", "4");
            }
            if (word.contains("t")) {    
                word = word.replace("t", "7");
            }
            if (word.charAt(word.length()-1) == 's') {
                word = word.substring(0,word.length() - 1) + "Z";
            }
            output.print("(" + word + ")" + " ");
        }
        
        output.println();
    }
}
