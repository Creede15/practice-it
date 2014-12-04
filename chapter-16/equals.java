/*
* Write a method equals2 that accepts a second list as a parameter and that 
* returns true if the two lists are equal and that returns false otherwise. 
* Two lists are considered equal if they store exactly the same values in
* exactly the same order and have exactly the same length.
*/

public boolean equals2(LinkedIntList list) {
    ListNode current1 = front;
    ListNode current2 = list.front; 
    
    if (current1 == null && current2 == null) {
        return true;
    } else if (current1 != null && current2 != null) {
    
        while (current1 != null && current2 != null) {
        
            if (current1.data != current2.data) {
                return false;
            } else {
                current1 = current1.next;
                current2 = current2.next;
            }
            
        }
        
        return current1 == null && current2 == null;
    }
    
    return false;
}
