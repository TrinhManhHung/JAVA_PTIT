import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class SinhVien{
    private String id, name, className, email, phoneNum, sex;
    //method
    public SinhVien(String id, String name, String sex, String className, String email, String phoneNum) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNum = phoneNum;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }
    public String getSex() {
        return sex;
    }
    
    public String toString(){
        return this.id + " " + this.name + " " + this.className + " " + this.email + " " + this.phoneNum;
    }
}

public class J99210_DANH_SACH_DONG_PHUC_SINH_VIEN_PTIT{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DANGKY.in"));
        Scanner sc = new Scanner(System.in);

        //solve SinhVien
        HashMap<String, SinhVien> map = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            map.put(x.getId(), x);
        }
        //solve DangKy
        HashMap<String, ArrayList<String>> dangky = new HashMap<>();
        while(sc2.hasNextLine()){
            String[] words = sc2.nextLine().trim().split("\\s+");
            if(dangky.containsKey(words[1])){
                dangky.get(words[1]).add(words[0]);
            }
            else{
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(words[0]);
                dangky.put(words[1], tmp);
            }
        }
        //solve
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String gioiTinh = sc.next();
            String size = sc.next();
            System.out.println("DANH SACH SINH VIEN " + gioiTinh.toUpperCase() + " DANG KY SIZE " + size);
            ArrayList<String> maSV = dangky.get(size);
            if(maSV.size() != 0){
                Collections.sort(maSV, new Comparator<String>(){
                    @Override
                    public int compare(String a, String b){
                        return a.compareTo(b);
                    }
                });

                for(String x : maSV){
                    SinhVien a = map.get(x);
                    if(a.getSex().equals(gioiTinh)){
                        System.out.println(a);
                    }
                }
            }
        }
        sc1.close();
        sc2.close();
        sc.close();
    }
}

