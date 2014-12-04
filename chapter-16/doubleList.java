/*
* Write a method doubleList that doubles the size of a list by appending a 
* copy of the original sequence to the end of the list. 
*/

public void doubleList() {
    if (front != null) {
        ListNode end = front;
        int size = 1;
        
        while (end.next != null) {
            size++;
            end = end.next;
        }
        
        ListNode current = front;
        
        while (size > 0) {
            size--;
            end.next = new ListNode(current.data);
            current = current.next;
            end = end.next;
        }
        
    }
}
