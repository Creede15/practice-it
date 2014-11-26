/*
* Write a method called wordWrap that accepts a Scanner representing an 
* input file as its parameter and outputs each line of the file to the
* console, word-wrapping all lines that are longer than 60 characters. 
*/

public static void wordWrap(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        int length = line.length();
        int startPoint = 0;
        int endPoint = 60;
        
        while (length > 60) {
            System.out.println(line.substring(startPoint, endPoint));
            startPoint += 60;
            endPoint += 60;
            length -= 60;
        }
        
        System.out.println(line.substring(startPoint, line.length()));
    }
}
