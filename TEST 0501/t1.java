import java.util.*;

public class t1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] words = s.trim().split("\\s+");

            for(int i = words.length - 1; i >=0; i--){
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
2
I like this program very much
  much very program this like I
 */