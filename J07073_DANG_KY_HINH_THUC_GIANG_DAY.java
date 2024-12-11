//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;

class MonHoc implements Comparable<MonHoc>{
    private String id, name, lyThuyet, thucHanh;
    private int tinChi;
    //method
    public MonHoc(String id, String name, int tinChi, String lyThuyet, String thucHanh){
        this.id = id;
        this.name = name;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.tinChi = tinChi;
    }
    public String getThucHanh(){
        return this.thucHanh;
    }
    @Override
    public int compareTo(MonHoc other){
        return this.id.compareTo(other.id);
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.tinChi + " " + this.lyThuyet + " " + this.thucHanh;
    }
}
public class J07073_DANG_KY_HINH_THUC_GIANG_DAY {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0; i <n; i++){
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if(x.getThucHanh().equals("Truc tuyen") || (x.getThucHanh().length() > 12 && x.getThucHanh().substring(x.getThucHanh().length()-12).equals(".ptit.edu.vn")))
                arr.add(x);
        }
        Collections.sort(arr);
        for(MonHoc x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
