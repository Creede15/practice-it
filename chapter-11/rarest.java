/*
* Write a method rarest that accepts a map whose keys are strings and whose values are 
* integers as a parameter and returns the integer value that occurs the fewest times in 
* the map. If there is a tie, return the smaller integer value. If the map is empty, throw 
* an exception. If there is a tie (two or more rarest ages that occur the same number of 
* times), return the youngest age among them. 
*/

public static int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
        Iterator<String> i = map.keySet().iterator();
        
        while (i.hasNext()) {
            int num = map.get(i.next());
            if (result.containsKey(num)) {
                result.put(num, result.get(num) + 1);
            } else {
                result.put(num, 1);
            }
        }
        
        Set<Integer> setKey = result.keySet();
        Iterator<Integer> i1 = setKey.iterator();
        int min = i1.next();
        
        while(i1.hasNext()) {
            int current = i1.next();
            if (result.get(current) < result.get(min)) {
                min = current;
            }
        }
        
        return min;

}
