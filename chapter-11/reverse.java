/*
* Write a method reverse that accepts a Map from integers to strings as a parameter and 
* returns a new Map of strings to integers that is the original's "reverse". The reverse of 
* a map is defined here to be a new map that uses the values from the original as its 
* keys and the keys from the original as its values. Since a map's values need not be 
* unique but its keys must be, it is acceptable to have any of the original keys as the 
* value in the result. In other words, if the original map has pairs (k1, v) and (k2, v), 
* the new map must contain either the pair (v, k1) or (v, k2). 
*/

public static Map<String, Integer> reverse(Map<Integer, String> map) {
    Map<String, Integer> result = new HashMap<String, Integer>();
    Set<Integer> setKey = map.keySet();
    Iterator<Integer> i = setKey.iterator();
    
    while (i.hasNext()) {
        int key = i.next();
        result.put(map.get(key), key);
    }
    
    return result;
}
