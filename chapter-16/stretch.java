/*
* Write a method stretch that takes an integer n as a parameter and that increases
* a list of integers by a factor of n by replacing each integer in the original 
* list with n copies of that integer.
*/

public void  stretch(int copies) {
    if (copies <= 0) {
        front = null;
    } else {
        ListNode current = front;
        
        while (current != null) {
            int value = current.data;
            
            for (int i = 1; i < copies; i++) {
                current.next = new ListNode(value, current.next);
                current = current.next;
            }
            
            current = current.next;
        }
    }
}
