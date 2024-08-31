import java.util.*;

class Point {
    // Attribute
    private double x;
    private double y;

    // Method
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point a) {
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }

    public String toString() {
        return x + " " + y;
    }
}

public class J04009_DIEN_TICH_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            Point p1, p2, p3;
            p1 = new Point(sc.nextDouble(), sc.nextDouble());
            p2 = new Point(sc.nextDouble(), sc.nextDouble());
            p3 = new Point(sc.nextDouble(), sc.nextDouble());
            
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);

            if (a < b + c && b < a + c && c < a + b) {
                double s = (a + b + c) / 2;
                double square = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("%.2f\n", square);
            } else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}