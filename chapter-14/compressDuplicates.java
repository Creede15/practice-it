/*
* Write a method compressDuplicates that accepts a stack of integers as a parameter and 
* that replaces each sequence of duplicates with a pair of values: a count of the number 
* of duplicates, followed by the actual duplicated number. 
*/

public static void compressDuplicates(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    if (s.isEmpty()) {
        return;
    }
    
    int count = 1;
    int num = s.pop();
    
    while (!s.isEmpty()) {
        if (s.peek() == num) {
            count++;
        } else {
            q.add(num);
            q.add(count);
            count = 1;
        }
        num = s.pop();
    }
    
    q.add(num);
    q.add(count);
    
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
