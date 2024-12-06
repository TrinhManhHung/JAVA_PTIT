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
    public String getClassName(){
        return this.className;
    }
    public String toString(){
        return this.id + " " + this.name + " ";
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
public class J07036_BANG_DIEM_THEO_LOP {

    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        
        HashMap<String, SinhVien> mapSV = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i =0; i <n; i++){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            mapSV.put(x.getId(), x);
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
               if(a.getIdMH().equals(b.getIdMH())){
                   return a.getIdSV().compareTo(b.getIdSV());
               }
               return a.getIdMH().compareTo(b.getIdMH());
           }
        });

        n = Integer.parseInt(sc3.nextLine());
        while(n-- > 0){
            String idClass = sc3.nextLine().trim();
            System.out.println("BANG DIEM lop " + idClass + ":");
            for(BangDiem x : arr3){
                if(mapSV.get(x.getIdSV()).getClassName().equals(idClass)){
                    System.out.print(mapSV.get(x.getIdSV()));
                    System.out.println(x.getIdMH() + " " + map.get(x.getIdMH()) + " " + x);
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