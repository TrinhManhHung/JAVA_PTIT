import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class SinhVien{
    private String id, name, phoneNum, email;
    //method
    public SinhVien(String id, String name, String phoneNum, String email){
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getTen(){
        String[] words = this.name.trim().split("\\s+");
        return words[words.length - 1];
    }
    public String getHo(){
        String[] words = this.name.trim().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length-1; i++){
            ten += words[i] + " ";
        }
        return ten.trim();
    }
    public String getID(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.phoneNum + " " + this.email;
    }
}

public class J07081_SAP_XEP_DANH_SACH_SINH_VIEN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                if(!a.getTen().equals(b.getTen())){
                    return a.getTen().compareTo(b.getTen());
                }
                if(!a.getHo().equals(b.getHo())){
                    return a.getHo().compareTo(b.getHo());
                }
                return a.getID().compareTo(b.getID());
            }
        });

        for(SinhVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}