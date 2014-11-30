/* 
* Write a method maxOccurrences that accepts a List of integers as 
* a parameter and returns the number of times the most frequently
* occurring integer (the "mode") occurs in the list. Solve this 
* problem using a Map as auxiliary storage. If the list is empty, 
* return 0. 
*/

public static int maxOccurrences(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Iterator<Integer> i = list.iterator();
    
    while (i.hasNext()) {
        int num = i.next();
        if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }
    
    Set<Integer> setKey = map.keySet();
    i = setKey.iterator();
    int max = 0;
    
    while(i.hasNext()) {
        int current = map.get(i.next());
        if (current > max) {
            max = current;
        }
    }
    
    return max;
}
