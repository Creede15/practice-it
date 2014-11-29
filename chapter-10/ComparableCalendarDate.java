public int compareTo(CalendarDate date) {
    if (year == date.year && month == date.month && day == date.day) {
        return 0;
    } else if (year == date.year && month == date.month && day > date.day) {
        return 1;
    } else if (year == date.year && month > date.month) {
        return 1;
    } else if (year > date.year) {
        return 1;
    } else {
        return -1;
    }
}
