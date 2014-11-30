/* 
* Write a method isUnique that accepts a Map from strings to strings as a 
* parameter and returns true if no two keys map to the same value (and 
* false if any two or more keys do map to the same value). The empty map 
* is considered to be unique, so your method should return true if passed 
* an empty map. 
*/

public static boolean isUnique(Map<String, String> map) {
    Set<String> setKey = map.keySet();
    Collection<String> collectionValue = map.values();
    Set<String> setValue = new HashSet<String>(collectionValue);
    return setKey.size() == setValue.size();
}
