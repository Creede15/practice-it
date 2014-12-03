/*
* Write a method switchPairs that takes a stack of integers as a parameter and 
* that switches successive pairs of numbers starting at the bottom of the stack.
*/

public static void switchPairs(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    if (s.size() % 2 != 0) {
        q.add(s.pop());
    }
    
    while (!s.isEmpty()) {
        int num1 = s.pop();
        int num2 = s.pop();
        q.add(num2);
        q.add(num1);
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
