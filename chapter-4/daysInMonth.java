/*
* Write a method named daysInMonth that accepts a month (an integer between 1 and 12)
* as a parameter and returns the number of days in that month in this year. For example, 
* the call daysInMonth(9) would return 30 because September has 30 days. Assume that 
* the code is not being run during a leap year (that February always has 28 days). 
*/

public static int daysInMonth(int month) {
    if (month == 2) {
        return 28;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        return 30;
    } else {
        return 31;
    }
}
