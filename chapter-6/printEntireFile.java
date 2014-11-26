/*
* Write a method named printEntireFile that prompts the user for a file name and prints
* the contents of that file to the console as output. You may assume that the file exists.
*/

public static void printEntireFile() throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("Type a file name: ");
    String name = console.next();
    Scanner output = new Scanner(new File(name));
    
    while (output.hasNextLine()) {
        System.out.println(output.nextLine());
    }
}
