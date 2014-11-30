/*
* Write a method countCommon that takes two Lists of integers as parameters and returns the 
* number of unique integers that occur in both lists. Use one or more Sets as storage to 
* help you solve this problem. 
*/

public static int countCommon(List<Integer> list1, List<Integer> list2) {
    Set<Integer> set = new HashSet<Integer>(list1);
    Iterator<Integer> i = set.iterator();
    int count = 0;
    
    while (i.hasNext()) {
        if (list2.contains(i.next())) {
            count++;
        }
    }
    
    return count;
}
