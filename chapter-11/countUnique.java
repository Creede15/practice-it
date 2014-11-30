/*
* Write a method countUnique that takes a List of integers as a parameter 
* and returns the number of unique integer values in the list. Use a Set 
* as auxiliary storage to help you solve this problem. 
*/

public static int countUnique(List<Integer> list) {
    Set<Integer> set = new HashSet<Integer>(list);
    return set.size();
}
