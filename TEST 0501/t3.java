import java.util.*;

public class t3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int cnt = 1;

        while(row <= n){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =0; i <row; i++){
                arr.add(cnt);
                cnt++;
            }
            Collections.sort(arr, new Comparator<Integer>(){
                @Override
                public int compare(Integer a, Integer b){
                    return b - a;
                }
            });
            for(int i =0; i <arr.size(); i++){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
/*
4

1
3 2
6 5 4
10 9 8 7
 */