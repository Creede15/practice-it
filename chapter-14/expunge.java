/*
* Write a method expunge that accepts a stack of integers as a parameter and makes sure 
* that the stack's elements are in non-decreasing order from top to bottom, by removing from 
* the stack any element that is smaller than any element(s) on top of it. 
*/

public static void expunge(Stack<Integer> s) {
    Stack<Integer> storage = new Stack<Integer>();
    
    if (s.size() > 1) {
        storage.push(s.pop());
        
        while (!s.isEmpty()) {
            int num = s.pop();
            if (num >= storage.peek()) {
                storage.push(num);
            }
        }
        
        while (!storage.isEmpty()) {
            s.push(storage.pop());
        }
    }
}
