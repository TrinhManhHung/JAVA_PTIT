import java.util.Scanner;

public class J01003_GIAI_PHUONG_TRINH_BAC_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0){
            if(b != 0){
                System.out.println("VN");
            }
            else
                System.out.println("VSN");
        }
        else{
            float x = -b / a;
            System.out.printf("%.2f", x);
        }
    }    
}
