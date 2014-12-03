/*
* Write a method stutter that takes a stack of integers as a parameter and 
* replaces every value in the stack with two occurrences of that value. 
*/

public static void stutter(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    while (!s.isEmpty()) {
        int num = s.pop();
        q.add(num);
        q.add(num);
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
