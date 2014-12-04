/*
* Write a method removeFront that takes an integer n as a parameter and
* that removes the first n values from a list of integers
*/

public void removeFront(int num) {
    for (int i = 0; i < num; i++) {
        elementData[i] = elementData[num + i];
    }
    
    size -= num;
}

public void removeAll(int value) {
    for (int i = 0; i < size; i++) {
        if (elementData[i] == value) {
            remove(i);
            i--;
        }
    }
}
