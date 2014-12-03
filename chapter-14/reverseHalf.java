/*
* Write a method reverseHalf that reverses the order of half of the elements of a Queue 
* of integers. Your method should reverse the order of all the elements in odd-numbered 
* positions (position 1, 3, 5, etc.) assuming that the first value in the queue has 
* position 0. 
*/

public static void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int oldSize = q.size();  
    
    for (int i = 0; i < oldSize; i++) {
        if (i % 2 == 0) {
            q.add(q.remove());
        } else {
            s.push(q.remove());
        }
    }
    
    while (!s.isEmpty()) {
        q.add(q.remove());
        q.add(s.pop());
    }
    
    if (oldSize % 2 == 1) {
        q.add(q.remove());
    }
}
