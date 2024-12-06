/**
 *
 * @author HUNG
 */
import java.util.*;

class SanPham{
    private String id, name;
    private long gia1, gia2;
    //method
    public SanPham(String id, String name, long gia1, long gia2){
        this.id = id;
        this.name = name;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public long getPrice(int type){
        if(type == 1) return gia1;
        else return gia2;
    }
}

class HoaDon{
    private String id;
    private long amount;
    private static int cnt = 0;
    //method
    public HoaDon(String id, long amount){
        cnt++;
        this.id = id + "-" + String.format("%03d", cnt);
        this.amount = amount;
    }
    public String getIdSanPham(){
        return this.id.substring(0, 2);
    }
    public int getType(){
        return Integer.parseInt(this.id.substring(2, 3));
    }
    public String getId(){
        return this.id;
    }
    public long getThanhTien(long price){
        return this.amount * price;
    }
    public long getGiamGia(long price){
        if(amount >= 150) return this.getThanhTien(price) / 2;
        else if(amount >= 100) return this.getThanhTien(price) * 3 / 10;
        else if(amount >= 50) return this.getThanhTien(price) * 15 / 100;
        else return 0;
    }
    public long getPhaiTra(long price){
        return this.getThanhTien(price) - this.getGiamGia(price);
    }
}
public class J06001_TINH_TOAN_HOA_DON_BAN_QUAN_AO {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr1 = new ArrayList<>();
        for(int i =0; i <n; i++){
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arr1.add(x);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> arr2 = new ArrayList<>();
        for(int i =0; i <m; i++){
            HoaDon x = new HoaDon(sc.next(), Long.parseLong(sc.nextLine().trim()));
            arr2.add(x);
        }
        
        for(HoaDon x : arr2){
            for(SanPham y : arr1){
                if(x.getIdSanPham().equals(y.getId())){
                    System.out.println(x.getId() + " " + y.getName() + " " + x.getGiamGia(y.getPrice(x.getType())) + " " + x.getPhaiTra(y.getPrice(x.getType()))); 
                }
            }
        }
        sc.close();
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105

AT1-001 Ao thun 1140000 6460000
QJ2-002 Quan Jean 3937500 9187500
*/