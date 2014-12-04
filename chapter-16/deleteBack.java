/*
* Write a method deleteBack that deletes the last value (the value at the back of the 
* list) and returns the deleted value. If the list is empty, your method should throw 
* a NoSuchElementException. 
*/

public int deleteBack() {
    ListNode current = front;
    
    if (current == null) {
        throw new NoSuchElementException();
    } else if (current.next == null) {
        int value = current.data;
        front = null;
        return value;
    } else {
    
        while (current.next.next != null) {
            current = current.next;
        }
        
        int value = current.next.data;
        current.next = null;
        return value;
    }
}
