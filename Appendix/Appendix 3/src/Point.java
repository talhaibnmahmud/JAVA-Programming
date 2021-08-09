class Point {
    private int x;
    private int y;

    Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

}

class CopyConstructorExample {
    public static void main(String[] args) {
        Point point = new Point(1, 3);
        Point clone = new Point(point);

        System.out.println(point.getX() + " " + point.getY());
        System.out.println(clone.getX() + " " + clone.getY());
    }
}