/*
* Write a method rearrange that takes a queue of integers as a parameter
* and rearranges the order of the values so that all of the even values 
* appear before the odd values and that otherwise preserves the original
* order of the list.
*/

public static void rearrange(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int oldSize = q.size();
    
    for (int i = 0; i < oldSize; i++) {
        int num = q.remove();
        if (num % 2 == 0) {
            s.push(num);
        } else {
            q.add(num);
        }
    }
    
    for (int i = 0; i < 2; i++) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}
