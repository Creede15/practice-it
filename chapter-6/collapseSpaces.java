/*
* Write a static method named collapseSpaces that accepts a Scanner representing
* a file as a parameter and writes that file's text to the console, with multiple 
* spaces or tabs reduced to single spaces between words that appear on the same line. 
*/

public static void collapseSpaces(Scanner console) {
    while (console.hasNextLine()) {
        String line = console.nextLine();
        Scanner input = new Scanner(line);
        
        while (input.hasNext()) {
            System.out.print(input.next() + " ");
        }
        
        System.out.println();
    }
}
