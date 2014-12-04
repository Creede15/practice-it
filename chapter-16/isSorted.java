/*
* Write a method isSorted that returns true if the list is in sorted 
* (nondecreasing) order and returns false otherwise. An empty list is 
* considered to be sorted. 
*/

public boolean isSorted() {
    ListNode pre = front;
    
    if (front == null) {
        return true;
    }
    
    while (pre.next != null) {
        ListNode current = pre.next;
        if (current.data < pre.data) {
            return false;
        }
        pre = current;
    }
    
    return true;
}
