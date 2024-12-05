/**
 *
 * @author HUNG
 */
import java.util.*;

class MonHoc{
    private String id, name;
    //method
    public MonHoc(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class GiangVien{
    private String id, name;
    private float allHours;
    //method
    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
        this.allHours = 0;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addHours(float x){
        allHours += x;
    }
    public String toString(){
        return this.name + " " + String.format("%.02f", this.allHours);
    }
}

class HocPhan{
    private String idGV, idMH;
    private float hours;
    //method
    public HocPhan(String idGV, String idMH, float hours) {
        this.idGV = idGV;
        this.idMH = idMH;
        this.hours = hours;
    }
    public String getIdGV(){
        return this.idGV;
    }
    public float getHours(){
        return this.hours;
    }
}
public class J06007_BANG_TINH_GIO_CHUAN {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0; i <n; i++){
            sc.next();
            sc.nextLine();
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> arr1 = new ArrayList<>();
        for(int i =1; i <=m; i++){
            GiangVien x = new GiangVien(sc.next(), sc.nextLine().trim());
            arr1.add(x);
        }
        
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<HocPhan> arr2 = new ArrayList<>();
        for(int i =1; i <=k; i++){
            HocPhan x = new HocPhan(sc.next(), sc.next(), Float.parseFloat(sc.nextLine()));
            arr2.add(x);
        }   
        
        for(HocPhan x : arr2){
            for(GiangVien y : arr1){
                if(y.getId().equals(x.getIdGV())){
                    y.addHours(x.getHours());
                }
            }
        }
        
        for(GiangVien y : arr1){
            System.out.println(y);
        }
        sc.close();
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
*/