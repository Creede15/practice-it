/*
* Write a method hasTwoConsecutive that returns whether or not a list of
* integers has two adjacent numbers that are consecutive integers (true 
* if such a pair exists and false otherwise). 
*/

public boolean hasTwoConsecutive() {
    ListNode current = front;
    
    if (front == null) {
        return false;
    } else {
    
        while (current.next != null) {
            if (current.data + 1 == current.next.data) {
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
}
