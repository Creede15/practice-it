/*
* Write a method called stripComments that accepts a Scanner representing an 
* input file containing a Java program as its parameter, reads that file, and
* then prints the file's text with all comments removed. A comment is any text
* on a line from // to the end of the line, and any text between /* and */ 
* characters. 
*/

public static void stripComments(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        if (!line.startsWith("/*")) {
            if (!line.contains("/*") && line.endsWith("*/")) {
                line = "";
            } else if (line.contains("/*") && line.contains("*/")) {
                line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
            } else if (line.contains("//")) {
                line = line.substring(0, line.indexOf("//"));
            }
            System.out.println(line);
        }
    }
}
