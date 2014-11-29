/* 
* Write a method markLength4 that takes an ArrayList of Strings as 
* a parameter and that places a string of four asterisks "****" in
* front of every string of length 4.
*/

public static void markLength4(ArrayList<String> array) {

    for (int i = 0; i < array.size(); i++) {
        if (array.get(i).length() == 4) {
            array.add(i, "****");
            i++;
        }
    }
    
}
