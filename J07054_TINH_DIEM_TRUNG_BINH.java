import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SinhVien{
    private String id, name;
    private float mon1, mon2, mon3;
    //method
    public SinhVien(int id, String name, float mon1, float mon2, float mon3){
        this.id = "SV" + String.format("%02d", id);
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
    public float getTB(){
        return (mon1 * 3 + mon2 * 3 + mon3 * 2) / 8;
    }
    public String getId(){
        return this.id;
    }

    public String toString(){
        chuanHoa1();
        return this.id + " " + this.name + " " + String.format("%.02f", getTB());
    }
}
public class J07054_TINH_DIEM_TRUNG_BINH {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                if(a.getTB() > b.getTB()){
                    return -1;
                }
                if(a.getTB() < b.getTB()) return 1;
                return a.getId().compareTo(b.getId()); 
            }
        });

        int stt = 0;
        int cnt = 1;
        for(int i =0; i <arr.size(); i++){
            if(i-1 >=0 && arr.get(i).getTB() == arr.get(i-1).getTB()){
                System.out.println(arr.get(i) + " " + stt);
                cnt++;
            }
            else{
                stt += cnt;
                cnt = 1;
                System.out.println(arr.get(i) + " " + stt);
            }
        }
        sc.close();
    }
}
