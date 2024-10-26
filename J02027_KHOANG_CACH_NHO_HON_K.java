import java.util.*;

public class J02027_KHOANG_CACH_NHO_HON_K{
    public static int lowerBound(ArrayList<Integer> arr, int num){
        int left = 0; int right = arr.size()-1;
        int idx = arr.size();
        while(left <= right){
            int mid = (right + left) / 2;
            if(arr.get(mid) < num) left = mid + 1;
            else{
                idx = mid;
                right = mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =0; i <n; i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);

            long res = 0;
            for(int i =0; i <n-1; i++){
                int tam = lowerBound(arr, arr.get(i) + k);
                res += Math.max(tam - i - 1, 0);
            }
            System.out.println(res);
        }
        sc.close();
    }
}
/*
2
4 3
1 10 4 2
3 5
2 3 4
 */