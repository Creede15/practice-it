/*
* Write a method called randomLines that prints between 5 and 10 random 
* strings of letters (between "a" and "z"), one per line. Each string 
* should have random length of up to 80 characters. 
*/

public static void randomLines() {
    Random random = new Random();
    int line = random.nextInt(5) + 5;
    
    for (int i = 0; i < line; i++) {
        int numOfChar = 0;
        
        while (numOfChar <= 0) {
            int letter = random.nextInt(26) + 97;
            System.out.print((char)letter);
            numOfChar++;
        }
        
        System.out.println();
    }
}
