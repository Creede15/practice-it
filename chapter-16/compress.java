/* 
* Write a method compress that could be added to the LinkedIntList class,
* that accepts an integer n representing a "compression factor" and replaces
* every n elements with a single element whose data value is the sum of those
* n nodes. If the list's size is not an even multiple of n, whatever elements
* are left over at the end are compressed into one node. If n is greater than
* or equal to the list size, the entire list compresses into a single element.
* If the list is empty, the result after the call is empty regardless of what
* factor n is passed. You may assume that the value passed for n is >= 1.
*/

public void compress(int factor) {
    ListNode current = front;
    
    while (current != null) {
    
        for (int i = 1; i < factor; i++) {
            if (current.next != null) {
                current.data += current.next.data;
                current.next = current.next.next;
            } 
        }
        
        current = current.next;
    }
}
