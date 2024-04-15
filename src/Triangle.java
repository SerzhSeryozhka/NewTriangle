public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Triangle() {
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }

    public double perimetr(double x1, double x2, double x3, double y1, double y2, double y3) {
        double ab = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double ac = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double bc = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        return (ab + ac + bc);
    }
}
