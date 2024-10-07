import java.util.*;

public class J03026_XAU_KHAC_NHAU_DAI_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.length() < s2.length()){
                System.out.println(s2.length());
            }
            if(s1.length() > s2.length()){
                System.out.println(s1.length());
            }
            if(s1.length() == s2.length()){
                if(s1.equals(s2)){
                    System.out.println(-1);
                }
                else{
                    System.out.println(s1.length());
                }
            }
        }
        sc.close();
    }
}

/*
 */