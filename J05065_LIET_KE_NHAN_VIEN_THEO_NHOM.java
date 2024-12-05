
/**
 *
 * @author HUNG
 */
import java.util.*;

class NhanVien{
    private String id, name;
    private static int GD =0, TP =0, PP =0;
    //method
    public NhanVien(String id, String name){
        this.id = id;
        this.name = name;
        if(chucVu().equals("GD")) GD++;
        if(chucVu().equals("TP")) TP++;
        if(chucVu().equals("PP")) PP++;
        if(this.chucVu().equals("GD") && GD > 1)
        {
            this.id = "NV" + this.id.substring(2);
        }
        if(this.chucVu().equals("TP") && TP > 3)
        {
            this.id = "NV" + this.id.substring(2);
        }
        if(this.chucVu().equals("PP") && PP > 3)
        {
            this.id = "NV" + this.id.substring(2);
        }
    }
    public String chucVu(){
        return id.substring(0, 2);
    }
    public String heSoLuong(){
        return id.substring(2, 4);
    }
    public String soHieu(){
        return id.substring(4);
    }
    public String toString(){
        return this.name + " " + this.chucVu() + " " + this.soHieu() + " " + this.heSoLuong();
    }
}
public class J05065_LIET_KE_NHAN_VIEN_THEO_NHOM {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            NhanVien x = new NhanVien(sc.next(), sc.nextLine().trim());
            arr.add(x);
        }
        
        Collections.sort(arr, new Comparator<NhanVien>(){
           @Override
           public int compare(NhanVien a, NhanVien b){
               if(a.heSoLuong().equals(b.heSoLuong())){
                   return a.soHieu().compareTo(b.soHieu());
               }
               return b.heSoLuong().compareTo(a.heSoLuong());
           }
        });
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            for(NhanVien x : arr){
                if(x.chucVu().equals(s)){
                    System.out.println(x);
                }
            }
            if(q > 0){
                System.out.println("");
            }
        }
        sc.close();
    }
}
/*
9
GD08001 Nguyen Kim Loan
GD08002 Nguyen Kim Loan
TP05002 Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
PP06002 Tran Quoc Huy
PP06005 Tran Quoc Huy
NV04003 Vo Van Lan
4
GD
TP
PP
NV

Tran Binh Nguyen TP 001 05
Hoang Thanh Tuan TP 002 05

 
Tran Quoc Huy PP 001 06
Phan Trung Tuan PP 002 06
*/