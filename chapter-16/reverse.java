/*
* Write a method reverse that reverses the order of the elements in the list. 
*/

public void reverse() {
    LinkedIntList list = new LinkedIntList();
    
    if (front != null) {
        ListNode current = front.next;
        front.next = null;
        list.front = front;
        
        while (current != null) {
            ListNode temp = current;
            current = current.next;
            temp.next = list.front;
            list.front = temp;
        }
        
    }
    
    front = list.front;
}
