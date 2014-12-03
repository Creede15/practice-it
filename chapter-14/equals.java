/*
* Write a method equals that takes as parameters two stacks of integers and returns true 
* if the two stacks are equal and that returns false otherwise. To be considered equal, the 
* two stacks would have to store the same sequence of integer values in the same order. Your 
* method is to examine the two stacks but must return them to their original state before 
* terminating. You may use one stack as auxiliary storage. 
*/

public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
    Stack<Integer> storage = new Stack<Integer>();
    
    if (s1.size() != s2.size()) {
        return false;
    } else {
        boolean same = true;
        
        while (same && !s1.isEmpty()) {
            int num1 = s1.pop();
            int num2 = s2.pop();
            if (num1 != num2) {
                same = false;
            }
            storage.add(num1);
            storage.add(num2);
        }
        
        while (!storage.isEmpty()) {
            s2.push(storage.pop());
            s1.push(storage.pop());
        }
        
        return same;
    }
}
