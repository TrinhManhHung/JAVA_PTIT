import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, name;
    private int price;
    private float fee;
    //method
    public LoaiPhong(String s){
        String[] words = s.trim().split("\\s+");
        this.id = words[0];
        this.name = words[1];
        this.price = Integer.parseInt(words[2]);
        this.fee = Float.parseFloat(words[3]);
    }

    @Override
    public int compareTo(LoaiPhong b){
        return this.name.compareTo(b.name);
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.price + " " + this.fee;
    }
}
public class J07045_LOAI_PHONG {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
        in.close();
    }
}

