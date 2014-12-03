/*
* Write a method splitStack that takes a stack of integers as a parameter and splits it 
* into negatives and non-negatives. The numbers in the stack should be rearranged so 
* that all the negatives appear on the bottom of the stack and all the non-negatives appear 
* on the top. In other words, if after this method is called you were to pop numbers off 
* the stack, you would first get all the nonnegative numbers and then get all the negative 
* numbers. It does not matter what order the numbers appear in as long as all the negatives 
* appear lower in the stack than all the non-negatives. You may use a single queue as 
* auxiliary storage. 
*/

public static void splitStack(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
    
    int sizeOfStorage = q.size();
    
    for (int i = 0; i < sizeOfStorage; i++) {
        int num = q.remove();
        if (num < 0) {
            s.push(num);
        } else {
            q.add(num);
        }
    }
    
    while (!q.isEmpty()) {
        s.push(q.remove());
    }
}
