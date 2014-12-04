/*
* Write a method removeRange that accepts a starting and ending index
* as parameters and removes the elements at those indexes (inclusive) 
* from the list. 
*/

public void removeRange(int startIndex, int endIndex) {
    if (startIndex < 0 || endIndex < 0) {
        throw new IllegalArgumentException();
    } else {
        int index = 0;
        ListNode current = front;
        ListNode start = front;
        ListNode end = null;
        
        while (current != null) {
        
            if (index + 1 == startIndex) {
                start = current;
            } else if (index == endIndex) {
                end = current;
            }
            
            current = current.next;
            index++;
        }
        
        if (startIndex == 0) {
            front = end.next;
        } else {
            start.next = end.next;
        }
        
    }
}
