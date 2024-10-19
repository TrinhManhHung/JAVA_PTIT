import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07072_CHUAN_HOA_VA_SAP_XEP {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DANHSACH.in");
        Scanner sc = new Scanner(file);
        
        ArrayList<String> arrName = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().trim().toLowerCase().split("\\s+");
            String ten = "";
            for(int i =0; i <words.length; i++){
                ten += words[i].substring(0, 1).toUpperCase();
                ten += words[i].substring(1) + " ";
            }
            arrName.add(ten);
        }

        Collections.sort(arrName, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String[] tenA = a.toLowerCase().split("\\s+");
                String[] tenB = b.toLowerCase().split("\\s+");
                if(!tenA[tenA.length - 1].equals(tenB[tenB.length - 1])){
                    return tenA[tenA.length - 1].compareTo(tenB[tenB.length - 1]);
                }
                if(!tenA[0].equals(tenB[0])){
                    return tenA[0].compareTo(tenB[0]);
                }
                for(int i =1; i <Math.min(tenA.length, tenB.length) - 1; i++){
                    if(!tenA[i].equals(tenB[i])){
                        return tenA[i].compareTo(tenB[i]);
                    }
                }
                if(tenA.length > tenB.length) return 1;
                return -1;
            }
        });

        for(int i =0; i <arrName.size(); i++){
            System.out.println(arrName.get(i));
        }
        sc.close();
    }
}
