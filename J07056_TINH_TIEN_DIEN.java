//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */

 import java.util.*;
 import java.io.*;
 class KhachHang implements Comparable<KhachHang> {
     private static int stt = 0;
     private String id, name, type;
     private long startIdx, endIdx;
     //method
     public KhachHang(String name, String type, long startIdx, long endIdx){
         stt++;
         this.id = "KH" + String.format("%02d", stt);
         this.name = name;
         this.type = type;
         this.startIdx = startIdx;
         this.endIdx = endIdx;
         chuanHoaTen();
     }
     public void chuanHoaTen(){
         String[] words = this.name.trim().toLowerCase().split("\\s+");
         String ten = "";
         for(int i =0; i <words.length; i++){
             ten += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
         }
         this.name = ten.trim();
     }
     public int getDinhMuc(){
         if(this.type.equals("A")) return 100;
         if(this.type.equals("B")) return 500;
         return 200;
     }
     public long getTienTrong(){
         return Math.min(this.getDinhMuc(), endIdx-startIdx) * 450;
     }
     public long getTienVuot(){
         return Math.max(endIdx-startIdx-this.getDinhMuc(), 0) * 1000;
     }
     public long getVAT(){
         return this.getTienVuot() * 5 / 100;
     }
     public long getTong(){
         return this.getVAT() + this.getTienVuot() + this.getTienTrong();
     }
     public String toString(){
         return this.id + " " + this.name + " " + this.getTienTrong() + " " + this.getTienVuot() + " " + this.getVAT() + " " + this.getTong();
     }
     @Override
     public int compareTo(KhachHang other){
         if (this.getTong() - other.getTong() > 0) return -1;
         return 1;
     }
 }
 public class J07056_TINH_TIEN_DIEN {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(new File("KHACHHANG.in"));
         int n = Integer.parseInt(sc.nextLine());
         ArrayList<KhachHang> arr = new ArrayList<>();
         for(int i =0; i <n; i++){
             KhachHang x = new KhachHang(sc.nextLine(), sc.next().trim(), Long.parseLong(sc.next().trim()), Long.parseLong(sc.nextLine().trim()));
             arr.add(x);
         }
         Collections.sort(arr);
         for(KhachHang x : arr){
             System.out.println(x);
         }
         sc.close();
     }
 }
 /*
 2
 
  nGuyEn Hong Ngat
 C 200 278
  Chu thi    minh
 A 120 160
 */