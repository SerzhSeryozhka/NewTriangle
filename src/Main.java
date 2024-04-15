import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        list();
    }
    public static void list(){
        ArrayList<Triangle> triangles = new ArrayList<>();
        Triangle q = new Triangle();
        Triangle w=new Triangle();
        triangles.add(q);
        triangles.add(w);
        System.out.println("Треугольники q и w"+q+", "+w+" ");
    }
}
