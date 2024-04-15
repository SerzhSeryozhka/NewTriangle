import java.util.Scanner;

public class Point{
    Scanner scanner=new Scanner(System.in);
    private int x= scanner.nextInt(), y= scanner.nextInt();

    public Point() {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x =x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void storony(int x, int y){

    }
}
