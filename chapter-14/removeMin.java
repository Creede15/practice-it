/*
* Write a method removeMin that accepts a Stack of integers as a parameter
* and removes and returns the smallest value from the stack.
*/

public static int removeMin(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int min = s.peek();
    
    while (!s.isEmpty()) {
        int num = s.pop();
        q.add(num);
        
        if (min > num) {
            min = num;
        }
    }
    
    while (!q.isEmpty()) {
        int num = q.remove();
        
        if (num != min) {
            s.push(num);
        }
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    
    return min;
}
