/*
* Write a method reorder that takes a queue of integers as a parameter and that 
* puts the integers into sorted (nondecreasing) order assuming that the queue is
* already sorted by absolute value.
*/

public static void reorder(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();  
    int oldSize = q.size();
    int posNum = 0;
    
    for (int i = 0; i < oldSize; i++) {
        int num = q.remove();
        if (num < 0) {
            s.push(num);
        } else {
            q.add(num);
            posNum++;
        }
    }
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    for (int i = 0; i < posNum; i++) {
        q.add(q.remove());
    }
}
