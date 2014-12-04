/*
* Write a method rotate that moves the value at the front of a list of integers 
* to the end of the list. 
*/

public void rotate() {
    if (front != null && front.next != null) {
        ListNode firstNode = front;
        front = front.next;
        firstNode.next = null;
        ListNode current = front;
        
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = firstNode;
    }
}
