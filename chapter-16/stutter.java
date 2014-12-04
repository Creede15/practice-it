/*
* Write a method stutter that doubles the size of a list by replacing every integer
* in the list with two of that integer.
*/

public void stutter() {
    ListNode current = front;
    
    while (current != null) {
        current.next = new ListNode(current.data, current.next);
        current = current.next.next;
    }
}
