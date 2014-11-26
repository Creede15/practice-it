/*
* Write a method named getFileName that repeatedly prompts the user for a 
* file name until the user types the name of a file that exists on the system.
* Once you get a good file name, return that file name as a String. 
*/

public static String getFileName(){
    Scanner console = new Scanner(System.in);
    System.out.print("Type a file name: ");
    String name = console.next();
    File f = new File(name);
    
    while (!f.canRead()) {
        System.out.print("Type a file name: ");
        name = console.next();
        f = new File(name);
    }
    
    return name;
}
