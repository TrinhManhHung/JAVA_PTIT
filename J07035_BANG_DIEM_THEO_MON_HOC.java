//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.io.File;
import java.io.IOException;
import java.util.*;

class SinhVien{
    private String id, name, className, email;
    //method

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        ChuanHoaTen();
    }
    public void ChuanHoaTen(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public String getId(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.className + " ";
    }
}

class BangDiem{
    private String idSV, idMH;
    private float diem;
    //method
    public BangDiem(String idSV, String idMH, float diem) {
        this.idSV = idSV;
        this.idMH = idMH;
        this.diem = diem;
    }
    
    public String getIdSV(){
        return this.idSV;
    }
    public String getIdMH(){
        return this.idMH;
    }
    public float getDiem(){
        return this.diem;
    }
    public String toString(){
        if(this.diem % 1 == 0) return String.format("%.0f", diem);
        return String.valueOf(diem);
    }
}
public class J07035_BANG_DIEM_THEO_MON_HOC {

    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i =0; i <n; i++){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            arr1.add(x);
        }
        
        n = Integer.parseInt(sc2.nextLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i =0; i <n; i++){
            String id = sc2.nextLine().trim();
            String name = sc2.nextLine().trim();
            sc2.nextLine();
            map.put(id, name);
        }
        
        n = Integer.parseInt(sc3.nextLine());
        ArrayList<BangDiem> arr3 = new ArrayList<>();
        for(int i =0; i <n; i++){
            BangDiem x = new BangDiem(sc3.next().trim(), sc3.next().trim(), Float.parseFloat(sc3.nextLine().trim()));
            arr3.add(x);
        }
        Collections.sort(arr3, new Comparator<BangDiem>(){
           @Override
           public int compare(BangDiem a, BangDiem b){
               if(a.getDiem() == b.getDiem()){
                   return a.getIdSV().compareTo(b.getIdSV());
               }
               if(a.getDiem() < b.getDiem()) return 1;
               return -1;
           }
        });

        n = Integer.parseInt(sc3.nextLine());
        while(n-- > 0){
            String id = sc3.nextLine().trim();
            System.out.println("BANG DIEM MON " + map.get(id) + ":");
            for(BangDiem x : arr3){
                if(x.getIdMH().equals(id)){
                    for(SinhVien y : arr1){
                        if(y.getId().equals(x.getIdSV())){
                            System.out.print(y);
                            System.out.println(x);
                        }
                    }
                }
            }
        }
        sc1.close();
        sc2.close();
        sc3.close();
    }
}
/*
BANG DIEM MON Tin hoc co so 2:
B15DCKT199 Nguyen Trong Tung D15CQKT02-B 9
*/