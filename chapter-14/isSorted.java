/*
* Write a method isSorted that accepts a stack of integers as a parameter and returns true 
* if the elements in the stack occur in ascending (non-decreasing) order from top to 
* bottom, and false otherwise. That is, the smallest element should be on top, growing larger 
* toward the bottom. 
*/

public static boolean isSorted(Stack<Integer> s) {
    Stack<Integer> storage = new Stack<Integer>();
    boolean sorted = true;
    
    while (sorted && s.size() > 1) {
        storage.push(s.pop());
        if (storage.peek() > s.peek()) {
            sorted = false;
        }
    }
        
    while (!storage.isEmpty()) {
        s.push(storage.pop());
    }
    
    return sorted;
}
