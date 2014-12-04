/*
* Write a method countDuplicates that returns the number of duplicates in 
* a sorted list. The list will be in sorted order, so all of the duplicates 
* will be grouped together.
*/

public int countDuplicates() {
    int sum = 0;
    ListNode current = front;
    
    if (front == null) {
        return 0;
    }
    
    while (current.next != null) {
        if (current.data == current.next.data) {
            sum++;
        }
        current = current.next;
    }
    
    return sum;
}
