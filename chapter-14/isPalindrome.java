/*
* Write a method isPalindrome that takes a queue of integers as a parameter
* and returns true if the numbers in the queue represent a palindrome (and 
* false otherwise). A sequence of numbers is considered a palindrome if it 
* is the same in reverse order. 
*/

public static boolean isPalindrome(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int oldSize = q.size();
    
    for (int i = 0; i < oldSize; i++) {
        int num = q.remove();
        q.add(num);
        s.push(num);
    }
    
    boolean same = true;
    
    for (int i = 0; i < oldSize; i++) {
        int num = q.remove();
        if (num != s.pop()) {
            same = false;
        }
        q.add(num);
    }
    
    return same;
}
