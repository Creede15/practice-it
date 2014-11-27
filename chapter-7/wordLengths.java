/*
* Write a method called wordLengths that accepts a Scanner representing an input file as 
* its argument. Your method should read from the given file, count the number of letters in 
* each token in the file, and output a result diagram of how many words contain each number 
* of letters. Use tabs before the asterisks so that they'll line up. If there are no 
* words of a given length, omit that line from the output. 
*/

public static void wordLengths(Scanner console) {
    int[] array = new int[81];
    
    while (console.hasNext()) {
        array[console.next().length()]++;
    }
    
    for (int i = 1; i < array.length; i++) {
        if (array[i] != 0) {
            System.out.printf("%d: %d\t", i, array[i]);
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
