/*
* Write a method intersect that takes two Maps of strings to integers as parameters and 
* that returns a new map whose contents are the intersection of the two. The intersection of 
* two maps is defined here as the set of keys and values that exist in both maps. So 
* if some key K maps to value V in both the first and second map, include it in your result. 
* If K does not exist as a key in both maps, or if K does not map to the same value V 
* in both maps, exclude that pair from your result. 
*/

public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
    Set<String> setKey = map1.keySet();
    Iterator<String> i = setKey.iterator();
    Map<String, Integer> result = new HashMap<String, Integer>();
    
    while (i.hasNext()) {
        String current = i.next();
        if (map2.containsKey(current) && map2.get(current) == map1.get(current)) {
            result.put(current, map1.get(current));
        }
    }
    
    return result;
}
