/*
* Write a method named flipLines that accepts as its parameter a Scanner for
* an input file and that writes to the console the same file's contents with 
* successive pairs of lines reversed in order. 
*/

public static void flipLines(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        if (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        System.out.println(line);
    }
}
