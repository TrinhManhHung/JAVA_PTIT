import java.util.*;

class NhanVien{
    private String id;
    private String name;
    private String sex;
    private String birth;
    private String addr;
    private String taxId;
    private String contractDate;
    private static int amount;
    //method
    public NhanVien(String name, String sex, String birth, String addr, String taxId, String contractDate) {
        amount ++;
        this.id = String.format("%05d", amount);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.addr = addr;
        this.taxId =taxId;
        this.contractDate = contractDate;
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.sex + " " + this.birth + " " + this.addr + " " + this.taxId + " " + this.contractDate;
    }
}

public class J05006_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        for(NhanVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011

00001 Nguyen Van A Nam 22/10/1982 Mo Lao-Ha Dong-Ha Noi 8333012345 31/12/2013
00002 Ly Thi B Nu 15/10/1988 Mo Lao-Ha Dong-Ha Noi 8333012346 22/08/2011
00003 Hoang Thi C Nu 04/02/1981 Mo Lao-Ha Dong-Ha Noi 8333012347 22/08/2011
 */