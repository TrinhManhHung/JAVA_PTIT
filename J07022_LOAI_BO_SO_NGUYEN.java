import java.util.*;
import java.io.*;
public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        ArrayList<String> arr = new ArrayList<>();

        while(sc.hasNext()){
            if(sc.hasNextInt()){
                sc.next();
            }
            else{
            arr.add(sc.next());
            }
        }

        Collections.sort(arr);
        for(String s : arr){
            System.out.print(s + " ");
        }
        sc.close();
    }
}
