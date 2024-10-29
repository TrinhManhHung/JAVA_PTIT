import java.util.*;

class ThiSinh{
    private String id, name;
    double mon1, mon2;
    //method
    public ThiSinh(int id, String name, double mon1, double mon2) {
        this.id = "TS" + String.format("%02d", id);
        this.name = name;
        if(mon1 > 10) mon1 = mon1 / 10;
        if(mon2 > 10) mon2 = mon2 / 10;
        this.mon1 = mon1;
        this.mon2 = mon2;
    }

    public double diemTK(){
        return (mon1 + mon2) / 2;
    }
    public String status(){
        if(diemTK() < 5) return "TRUOT";
        else if(diemTK() < 8) return "CAN NHAC";
        else if(diemTK() <= 9.5) return "DAT";
        else return "XUAT SAC";
    }
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.02f", diemTK()) + " " + status();
    }
}

public class J05013_TUYEN_DUNG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh a, ThiSinh b){
                if(a.diemTK() > b.diemTK()){
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
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
 */