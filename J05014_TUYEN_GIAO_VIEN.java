import java.util.*;

class ThiSinh{
    private String id, name, idSubject;
    private double mon1, mon2;
    //method
    public ThiSinh(int id, String name, String idSubject, double mon1, double mon2) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.idSubject = idSubject;
        this.mon1 = mon1;
        this.mon2 = mon2;
    }

    public String getMon(){
        String monHoc = this.idSubject.substring(0, 1);
        if(monHoc.equals("A")) return "TOAN";
        if(monHoc.equals("B")) return "LY";
        return "HOA";
    }
    public double getDiem(){
        double diem = mon1 * 2 + mon2;
        Character c = idSubject.charAt(1);
        if(c == '1') return diem + 2.0;
        if(c == '2') return diem + 1.5;
        if(c == '3') return diem + 1.0;
        return diem;
    }
    public String getStatus(){
        if(getDiem() >= 18) return "TRUNG TUYEN";
        else return "LOAI";
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.getMon() + " " + String.format("%.01f", getDiem()) + " " + getStatus(); 
    }
}

public class J05014_TUYEN_GIAO_VIEN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh a, ThiSinh b){
                if(a.getDiem() > b.getDiem()){
                    return -1;
                }
                return 1;
            }
        });

        for(ThiSinh x : arr) System.out.println(x);
        sc.close();
    }
}

/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
 */