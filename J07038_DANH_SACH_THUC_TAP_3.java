import java.util.*;
import java.io.*;

class SinhVien{
    private String id, name, className, email;
    //method

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getEmail() {
        return email;
    }

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public void chuanHoa(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public String toString(){
        chuanHoa();
        return this.id + " " + this.name + " " + this.className;
    }
}

public class J07038_DANH_SACH_THUC_TAP_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));

        ArrayList<SinhVien> arr1 = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            arr1.add(x);
        }
        Collections.sort(arr1, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                return a.getId().compareTo(b.getId());
            }
        });

        n = Integer.parseInt(sc2.nextLine());
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, Integer> map11 = new HashMap<>();
        for(int i =1; i <=n; i++){
            String id = sc2.nextLine();
            String name = sc2.nextLine();
            Integer amount = Integer.parseInt(sc2.nextLine());
            map1.put(id, name);
            map11.put(id, amount);
        }

        n = Integer.parseInt(sc3.nextLine());
        HashMap<String, ArrayList<String>> map2 = new HashMap<>();
        for(int i =1; i <=n; i++){
            String idSV = sc3.next();
            String idDN = sc3.next();
            if(!map2.containsKey(idDN)){
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(idSV);
                map2.put(idDN, tmp);
            }
            else{
                ArrayList<String> tmp = map2.get(idDN);
                tmp.add(idSV);
                map2.put(idDN, tmp);
            }
        }
        sc3.nextLine();
        n = Integer.parseInt(sc3.nextLine());
        
        while(n-- > 0){
            String idDN = sc3.nextLine();
            System.out.println("DANH SACH THUC TAP TAI " + map1.get(idDN) + ":");
            ArrayList<String> arrSV = map2.get(idDN);
            Collections.sort(arrSV);
            for(int i = 0; i < (int)Math.min(arrSV.size(), map11.get(idDN)); i++){
                for(SinhVien y : arr1){
                    if(arrSV.get(i).equals(y.getId())){
                        System.out.println(y);
                    }
                }
            }
        }
        sc1.close();
        sc2.close();
        sc3.close();
    }
}

