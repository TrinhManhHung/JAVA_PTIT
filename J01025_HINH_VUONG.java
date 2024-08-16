import java.util.Scanner;

public class J01025_HINH_VUONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();

        int maxx = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        int minx = Math.min(x1, Math.min(x2, Math.min(x3, x4)));

        int maxy = Math.max(y1, Math.max(y2, Math.max(y3, y4)));
        int miny = Math.min(y1, Math.min(y2, Math.min(y3, y4)));

        int canh = Math.max(maxx - minx, maxy - miny);
        System.out.println(canh * canh);
    }
}
