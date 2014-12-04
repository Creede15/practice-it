/*
* Write a method switchPairs that switches the order of elements in a linked
* list of integers in a pairwise fashion. Your method should switch the order 
* of the first two values, then switch the order of the next two, switch the 
* order of the next two, and so on.
*/

public void switchPairs() {
    ListNode current = front;
    
    while (current != null && current.next != null) {
        int temp = current.data;
        current.data = current.next.data;
        current.next.data = temp;
        current = current.next.next;
    }
}
