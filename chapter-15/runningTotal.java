/*
* Write a method runningTotal that returns a new ArrayIntList that contains a 
* running total of the original list. In other words, the i th value in the new
* list should store the sum of elements 0 through i of the original list.
*/

public ArrayIntList runningTotal() {
    ArrayIntList result = new ArrayIntList(size);
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += elementData[i];
        result.add(sum);
    }
    return result;
}
