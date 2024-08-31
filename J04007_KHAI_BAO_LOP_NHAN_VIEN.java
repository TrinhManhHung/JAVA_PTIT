import java.util.*;

class NhanVien  {
    //Attribute
    private String id;
    private String name;
    private String sex;
    private String birth;
    private String address;
    private String taxCode;
    private String contractDate;
    //Method
    public NhanVien(String id, String name, String sex, String birth, String address, String taxCode,
            String contractDate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }
    public String toString (){
        return this.id + " " + this.name + " " + this.sex + " " + this.birth + " " + this.address + " " + this.taxCode + " " + this.contractDate;
    }
}

public class J04007_KHAI_BAO_LOP_NHAN_VIEN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(x);
        sc.close();
    }
}
/*
Nguyen Van Hoa
Nam
22/11/1982
Mo Lao-Ha Dong-Ha Noi
8333123456
31/12/2013
 */