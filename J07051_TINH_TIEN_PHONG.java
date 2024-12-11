//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class KhachHang{
    private String id, name, room, startDate, endDate;
    private int addMoney;
    private static int cnt = 0;
    //method
    public KhachHang(String name, String room, String startDate, String endDate, int addMoney){
        cnt++;
        this.id = "KH" + String.format("%02d", cnt);
        this.name = name;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.addMoney = addMoney;
        chuanHoaTen();
        chuanHoaNgay();
    }
    
    public void chuanHoaTen(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public void chuanHoaNgay(){
        StringBuilder sb = new StringBuilder(this.startDate);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.startDate = sb.toString();
        StringBuilder sb2 = new StringBuilder(this.endDate);
        if(sb2.charAt(2) != '/') sb2.insert(0, '0');
        if(sb2.charAt(5) != '/') sb2.insert(3, '0');
        this.endDate = sb2.toString();        
    }
    public String getRoom(){
        return this.room;
    }
    public int getSoNgay(){
        //dinh dang ngay
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate start = LocalDate.parse(this.startDate, format);
        LocalDate end = LocalDate.parse(this.endDate, format);
        
        long day = ChronoUnit.DAYS.between(start, end);
        return (int)day + 1;
    }
    
    public int getPrice(){
        if(this.room.charAt(0) == '1') return 25;
        if(this.room.charAt(0) == '2') return 34;
        if(this.room.charAt(0) == '3') return 50;
        return 80;
    }
    public int getThanhTien(){
        return this.getSoNgay() * this.getPrice() + this.addMoney;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.room + " " + this.getSoNgay() + " " + this.getThanhTien();
    }
}
public class J07051_TINH_TIEN_PHONG {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            sc.nextLine();
            KhachHang x = new KhachHang(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<KhachHang>(){
           @Override
           public int compare(KhachHang a, KhachHang b){
               return b.getThanhTien() - a.getThanhTien(); 
           }
        });
        
        for(KhachHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
