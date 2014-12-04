/*
* Write a method removeEvens that removes the values in even-numbered indexes
* from a list, returning a new list containing those values in their original 
* order.
*/

public LinkedIntList removeEvens() {
    LinkedIntList result = new LinkedIntList();
    
    if (front != null) {
        result.front = front;
        front = front.next;
        result.front.next = null;
        ListNode currentResult = result.front;
        ListNode current = front;
        
        while (current != null && current.next != null) {
            currentResult.next = current.next;
            currentResult = currentResult.next;
            current.next = current.next.next;
            
            if (currentResult != null) {
                currentResult.next = null;
            }
            
            current = current.next;           
        }
        
    }
    
    return result;
}
