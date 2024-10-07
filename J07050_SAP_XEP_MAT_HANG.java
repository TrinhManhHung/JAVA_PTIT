import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class MatHang implements Comparable<MatHang>{
    private String id, name, group;
    private double mua, ban;
    //method
    public MatHang(int id, String name, String group, double mua, double ban){
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.group = group;
        this.mua  = mua;
        this.ban = ban;
    }
    public double loiNhuan(){
        return this.ban - this.mua;
    }

    @Override
    public int compareTo(MatHang b){
        if(this.loiNhuan() > b.loiNhuan()){
            return -1;
        }
        return 1;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.group + " " + String.format("%.02f", this.loiNhuan());
    }
}

public class J07050_SAP_XEP_MAT_HANG{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr);

        for(MatHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}