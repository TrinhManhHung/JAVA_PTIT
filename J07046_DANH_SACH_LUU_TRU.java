import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class KhachHang{
    private String id, name, roomId, dateIn, dateOut;
    //method
    public KhachHang(int id, String name, String roomId, String dateIn, String dateOut){
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.roomId = roomId;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public int getStayDay(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayDen = LocalDate.parse(this.dateIn, formatter);
        LocalDate ngayDi = LocalDate.parse(this.dateOut,formatter);

        int stayDay = (int)ChronoUnit.DAYS.between(ngayDen, ngayDi);
        return stayDay;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.roomId + " " + getStayDay();
    }
}
public class J07046_DANH_SACH_LUU_TRU {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang a, KhachHang b){
                return b.getStayDay() - a.getStayDay();
            }
        });

        for(KhachHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
