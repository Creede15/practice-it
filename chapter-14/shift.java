/*
* Write a method shift that takes a stack of integers and an integer n 
* as parameters and that shifts n values from the bottom of the stack 
* to the top of the stack. You may assume that the parameter n is >= 0 
* and not larger than the number of elements in the stack.
*/

public static void shift(Stack<Integer> s, int n) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    int remove = s.size() - n;
    
    while (remove > 0) {
        q.add(s.pop());
        remove--;
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
}
