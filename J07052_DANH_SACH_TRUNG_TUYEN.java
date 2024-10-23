import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class ThiSinh{
    private String id, name;
    private double mon1, mon2, mon3;
    private String status;
    //method
    public ThiSinh(String id, String name, double mon1, double mon2, double mon3){
        this.id = id;
        this.name = name;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public void chuanHoa1(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
            ten += words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public double getUuTien(){
        String kv = this.id.substring(0, 3);
        if(kv.equals("KV1")) return 0.5;
        if(kv.equals(("KV2"))) return 1;
        return 2.5;
    }
    public double getTrungTuyen(){
        return this.mon1 * 2 + this.mon2 + this.mon3 + this.getUuTien();
    }
    public String getId(){
        return this.id;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public String toString(){
        chuanHoa1();
        String uuTien, trungTuyen;
        if(this.getUuTien() % 1 == 0){
            uuTien = String.format("%.0f", this.getUuTien());
        }
        else uuTien = String.format("%.1f", this.getUuTien());

        if(this.getTrungTuyen() % 1 == 0){
            trungTuyen = String.format("%.0f", this.getTrungTuyen());
        }
        else trungTuyen = String.format("%.1f", this.getTrungTuyen());

        return this.id + " " + this.name + " " + uuTien + " " + trungTuyen + " " + this.status;
    }
}
public class J07052_DANH_SACH_TRUNG_TUYEN {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh a, ThiSinh b){
                if(a.getTrungTuyen() > b.getTrungTuyen()){
                    return -1;
                }
                if(a.getTrungTuyen() < b.getTrungTuyen()) return 1;
                return a.getId().compareTo(b.getId()); 
            }
        });

        int amount = sc.nextInt();
        double diemTrungTuyen = arr.get(amount - 1).getTrungTuyen();
        System.out.printf("%.1f", diemTrungTuyen);
        System.out.println();

        for(int i =0; i <arr.size(); i++){
            if(arr.get(i).getTrungTuyen() >= diemTrungTuyen){
                arr.get(i).setStatus("TRUNG TUYEN");
            }
            else{
                arr.get(i).setStatus("TRUOT");
            }
            System.out.println(arr.get(i));
        }
        sc.close();
    }
}
/*
32.0
KV3B123 Ly Thi Thu Ha 2.5 32 TRUNG TUYEN
KV2A002 Hoang Thanh Tuan 1 22 TRUOT

32.0
KV3B123 Ly Thi Thu Ha 2.5 32 TRUNG TUYEN
KV2A002 Hoang Thanh Tuan 1 22 TRUOT
 */