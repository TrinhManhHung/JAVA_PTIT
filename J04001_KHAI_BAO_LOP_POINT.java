import java.util.*;

class Point  {
    //Attribute
    private double x;
    private double y;
    //Method
    Point(){
        this.x = 0;
        this.y = 0; 
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance (Point b){
        return Math.sqrt((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
    }
    public String toString (Point b){
        return String.format("%.4f", distance(b));
    }
}


public class J04001_KHAI_BAO_LOP_POINT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            p1.distance(p2);
            System.out.println(p1.toString(p2));
        }
        sc.close();
    }
}