import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;

class ThiSinh{
    private String id, name, danToc;
    private int khuVuc;
    private double diem;
    //method
    public ThiSinh(int id, String name, double diem, String danToc, int khuVuc){
        this.id = "TS" + String.format("%02d", id);
        this.name = name;
        this.diem = diem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
    }

    public void chuanHoa(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
            ten += words[i].substring(1) + " ";
        } 
        this.name = ten.trim();
    }
    public double diemKV(){
        if(this.khuVuc == 1) return 1.5;
        else if(this.khuVuc == 2) return 1;
        return 0;
    }
    public double diemDT(){
        if(this.danToc.equals("Kinh")) return 0;
        return 1.5;
    }
    public double diemTK(){
        return this.diem + this.diemDT() + this.diemKV();
    }
    public String status(){
        if(diemTK() >= 20.5) return "Do";
        else return "Truot";
    }
    public String getID(){
        return this.id;
    }

    public String toString(){
        chuanHoa();
        return this.id + " " + this.name + " " + String.format("%.01f", this.diemTK()) + " " + this.status();
    }
}

public class J07057_DIEM_TUYEN_SINH {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            ThiSinh x = new ThiSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh a, ThiSinh b){
                if(a.diemTK() > b.diemTK()){
                    return -1;
                }
                if(a.diemTK() < b.diemTK()){
                    return 1;
                }
                return a.getID().compareTo(b.getID());
            }
        });

        for(ThiSinh x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*

 */