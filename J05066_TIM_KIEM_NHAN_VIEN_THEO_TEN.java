import java.util.*;

class NhanVien{
    private String id, name;
    //method
    public NhanVien(String id, String name){
        this.id = id;
        this.name = name;
        if(this.getChucVu().equals("GD") && Integer.parseInt(this.getSoHieu()) > 1){
            this.id = "NV" + this.id.substring(2);
        }
        if((this.getChucVu().equals("TP") || this.getChucVu().equals("PP")) && Integer.parseInt(this.getSoHieu()) > 3){
            this.id = "NV" + this.id.substring(2);
        } 
    }
    public String getChucVu(){
        return this.id.substring(0, 2);
    }
    public String getHeSoLuong(){
        return this.id.substring(2, 4);
    }
    public String getSoHieu(){
        return this.id.substring(4);
    }

    public boolean checkName(String x){
        x = x.toLowerCase();
        String ten = this.name.toLowerCase();
        if(ten.contains(x)) return true;
        else return false;
    }
    public String toString(){
        return this.name + " " + this.getChucVu() + " " + this.getSoHieu() + " " + this.getHeSoLuong();
    }
}
public class J05066_TIM_KIEM_NHAN_VIEN_THEO_TEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            String id = sc.next();
            String name = sc.nextLine().trim();
            NhanVien x = new NhanVien(id, name);
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien a, NhanVien b){
                if(!a.getHeSoLuong().equals(b.getHeSoLuong())){
                    return Integer.parseInt(b.getHeSoLuong()) - Integer.parseInt(a.getHeSoLuong());
                }
                return Integer.parseInt(a.getSoHieu()) - Integer.parseInt(b.getSoHieu());
            }
        });

        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String x = sc.nextLine();
            for(NhanVien v : arr){
                if(v.checkName(x)){
                    System.out.println(v);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
6
GD08001 Nguyen Kim Loan
TP05002 Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
OA
aN
 */