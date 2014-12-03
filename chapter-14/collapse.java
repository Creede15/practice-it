/*
* Write a method collapse that takes a stack of integers as a parameter
* and that collapses it by replacing each successive pair of integers 
* with the sum of the pair. 
*/

public static void collapse(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    if (s.size() % 2 != 0) {
        q.add(s.pop());
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop() + s.pop());
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
