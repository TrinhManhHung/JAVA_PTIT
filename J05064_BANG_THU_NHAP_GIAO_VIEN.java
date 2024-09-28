import java.util.*;

class GiaoVien {
    private String id, name;
    private long salary, level;
    //method
    public GiaoVien(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.level = Integer.parseInt(id.substring(2));
    }

    public String chucVu(){
        return this.id.substring(0, 2);
    }
    public long phuCap(){
        if(id.substring(0, 2).equals("HT")) return 2000000;
        if(id.substring(0, 2).equals("HP")) return 900000;
        return 500000;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.level + " " + this.phuCap() + " " + (this.salary * this.level + this.phuCap());
    }
}

public class J05064_BANG_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<GiaoVien> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            sc.nextLine();
            GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
            arr.add(x);
        }

        int cntHT = 0;
        int cntHP = 0;

        for(GiaoVien x : arr){
            if(x.chucVu().equals("HT") && cntHT == 0){
                System.out.println(x);
                cntHT = 1;
            }
            if(x.chucVu().equals("HP") && cntHP < 2){
                System.out.println(x);
                cntHP += 1;
            }
            else if(x.chucVu().equals("GV")){
                System.out.println(x);
            }
        }
        sc.close();
    }
}

/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
HP02
Tran Binh Nguyen
1468000
HP02
Tran Binh Nguyen
1468000
HP02
Tran Binh Nguyen
1468000
HT05
Hoang Thanh Tuan
1780000
GV01
Nguyen Kim Loan
1420000
 */