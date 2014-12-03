/*
* Write a method isConsecutive that takes a stack of integers as a parameter and that returns 
* whether or not the stack contains a sequence of consecutive integers starting from the 
* bottom of the stack (returning true if it does, returning false if it does not). Consecutive 
* integers are integers that come one after the other, as in 5, 6, 7, 8, 9, etc. 
*/

public static boolean isConsecutive(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    if (s.size() < 2) {
        return false;
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    boolean consecutive = true;
    s.push(q.remove());
    
    while (!q.isEmpty()) {
        if (s.peek() - 1 != q.peek()) {
            consecutive = false;
        }
        s.push(q.remove());
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    
    return consecutive;
}
