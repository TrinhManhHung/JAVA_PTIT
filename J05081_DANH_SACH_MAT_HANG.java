import java.util.*;

class Items  {
    //Attribute
    private String id;
    private String name;
    private String unit;
    private int buyPrice;
    private int sellPrice;
    private static int num = 0;
    //Method
    Items (String name, String unit, int buyPrice, int sellPrice){
        num++; String newId = "MH" + num;
        StringBuilder sb = new StringBuilder(newId);
        while(sb.length() < 5){
            sb.insert(2, '0');
        }
        this.id = sb.toString();
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public int getBuyPrice(){
        return this.buyPrice;
    }
    public int getSellPrice(){
        return this.sellPrice;
    }
    public String toString (){
        return this.id + " " + this.name + " " + this.unit + " " + this.buyPrice + " " + this.sellPrice + " " + (this.sellPrice - this.buyPrice);
    }
}

public class J05081_DANH_SACH_MAT_HANG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Items> arr = new ArrayList<>(); 
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            sc.nextLine();
            Items x = new Items(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Items>() {
            @Override
            public int compare (Items a, Items b){
                int profitOfA = a.getSellPrice() - a.getBuyPrice();
                int profitOfB = b.getSellPrice() - b.getBuyPrice();
                return profitOfB - profitOfA;
            }
        });

        for(Items x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
 */