//package com.mycompany.ptit_java;
/**
 *
 * @author HUNG
 */
import java.util.*;
import java.io.*;

class MonHoc{
    private String id, name;
    private int tinChi;
    //method

    public MonHoc(String id, String name, int tinChi) {
        this.id = id;
        this.name = name;
        this.tinChi = tinChi;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}

class LichGD implements Comparable<LichGD>{
    private String id, idMH, name, room;
    private int day, kip;
    private static int cnt = 0;
    //method
    public LichGD(String idMH, int day, int kip, String name, String room){
        cnt++;
        this.id = "HP" + String.format("%03d", cnt);
        this.idMH = idMH;
        this.day = day;
        this.kip = kip;
        this.name = name;
        this.room = room;
    }
    public String getIdMH(){
        return this.idMH;
    }
    @Override
    public int compareTo(LichGD other){
        if(this.day != other.day){
            return this.day - other.day;
        }
        if(this.kip != other.kip){
            return this.kip - other.kip;
        }
        return this.name.compareTo(other.name);
    }
    public String toString(){
        return this.id + " " + this.day + " " + this.kip + " " + this.name + " " + this.room;
    }
}
public class J07074_LICH_GIANG_DAY_THEO_MON_HOC {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        
        HashMap<String, MonHoc> map = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i =0; i <n; i++){
            MonHoc x = new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()));
            map.put(x.getId(), x);
        }
        n = Integer.parseInt(sc2.nextLine());
        ArrayList<LichGD> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            LichGD x = new LichGD(sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()), sc2.nextLine(), sc2.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        String id = sc2.nextLine();
        System.out.println("LICH GIANG DAY MON " + map.get(id).getName() + ":");
        for(LichGD x : arr){
            if(x.getIdMH().equals(id)){
                System.out.println(x);
            }
        }
        sc1.close();
        sc2.close();
    }
}
