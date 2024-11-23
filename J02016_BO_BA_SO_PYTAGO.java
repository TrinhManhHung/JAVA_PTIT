import java.util.*;

public class J02016_BO_BA_SO_PYTAGO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số test case
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                arr[i] = x * x; // Lưu bình phương của từng phần tử
            }

            Arrays.sort(arr); // Sắp xếp mảng bình phương

            boolean found = false;

            // Duyệt phần tử lớn nhất (c^2) từ cuối mảng
            for (int k = n - 1; k >= 2; k--) {
                int i = 0; // Con trỏ đầu
                int j = k - 1; // Con trỏ cuối
                while (i < j) {
                    if (arr[i] + arr[j] == arr[k]) {
                        found = true;
                        break;
                    } else if (arr[i] + arr[j] < arr[k]) {
                        i++;
                    } else {
                        j--;
                    }
                }
                if (found) break;
            }

            if (found) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}