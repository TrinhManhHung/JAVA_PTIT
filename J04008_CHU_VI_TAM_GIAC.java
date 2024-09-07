import java.util.*;

class Point {
    double x;
    double y;
    //method
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance (Point b){
        return Math.sqrt((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
    }
}

public class J04008_CHU_VI_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double canh1 = a.distance(b);
            double canh2 = a.distance(c);
            double canh3 = b.distance(c);

            if (canh1 >= canh2 + canh3 || canh2 >= canh1 + canh3 || canh3 >= canh1 + canh2){
                System.out.println("INVALID");
            }
            else {
                System.out.printf("%.3f", canh1 + canh2 + canh3);
                System.out.println();
            }
        }
        sc.close();
    }
}
/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0

INVALID
INVALID
17.071
 */
