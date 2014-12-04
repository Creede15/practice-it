/*
* Write a method split that rearranges the elements of a list so that all 
* of the negative values appear before all of the non-negatives.
*/

public void split() {
    ListNode current = front;
    
    if (current != null) {
    
        while (current.next != null) {
        
            if (current.next.data < 0) {
                ListNode temp = current.next.next;
                current.next.next = front;
                front = current.next;
                current.next = temp;
            } else {
                current = current.next;
            }
        }
        
    }
    
}
