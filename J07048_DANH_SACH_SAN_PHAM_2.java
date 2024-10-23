import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SanPham{
    private String id, name;
    private int price, warranty;
    //method
    public SanPham(String id, String name, int price, int warranty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public int getPrice(){
        return this.price;
    }
    public String getId(){
        return this.id;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.price + " " + this.warranty;
    }
}
public class J07048_DANH_SACH_SAN_PHAM_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham a, SanPham b){
                if(a.getPrice() != b.getPrice()){
                    return b.getPrice() - a.getPrice();
                }
                return a.getId().compareTo(b.getId());
            }
        });

        for(SanPham x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
