public int compareTo(Point2D p) {
    double distance1 = Math.sqrt(x * x + y * y);
    double distance2 = Math.sqrt(p.x * p.x + p.y * p.y);
    if (distance1 - distance2 < 0) {
        return -1;
    } else if (distance1 - distance2 > 0) {
        return 1;
    } else {
        return 0;
    }
}
