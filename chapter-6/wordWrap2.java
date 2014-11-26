/*
* Modify the preceding wordWrap method into a new wordWrap2 method that
* accepts a second parameter for a PrintStream to write the data, and
* outputs the newly wrapped text to that PrintStream rather than to the
* console. Also, modify it to use a local variable to store the maximum 
* line length rather than hard-coding 60.
*/

public static final int max = 60;
public static void wordWrap2(Scanner input, PrintStream output) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        int length = line.length();
        int startPoint = 0;
        int endPoint = max;
        
        while (length > max) {
            output.println(line.substring(startPoint, endPoint));
            startPoint += max;
            endPoint += max;
            length -= max;
        }
        
        output.println(line.substring(startPoint, line.length()));
    }
}
