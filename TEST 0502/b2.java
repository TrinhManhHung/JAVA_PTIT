import java.util.*;
import java.io.*;

class BaiTap{
    private String id, name, type;

    public BaiTap(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.type + " ";
    }
}

class BaoCao{
    private String id, hours;
    public BaoCao(String id, String hours) {
        this.id = id;
        this.hours = hours;
    }

    public String getId() {
        return id;
    }

    public int getHours() {
        return Integer.parseInt(hours.substring(0, 2));
    }
    public int getMinutes() {
        return Integer.parseInt(hours.substring(3));
    }
    public String getGio(){
        String gio = "";
        gio = hours.substring(0, 2) + "h" + hours.substring(3);
        return gio;
    }
}
public class b2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("BAITAP.in"));
        Scanner sc2 = new Scanner(new File("BAOCAO.in"));
        
        HashMap<String, BaiTap> map = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i =1; i <=n; i++){
            BaiTap x = new BaiTap(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            String id = x.getId();
            map.put(id, x);
        }

        ArrayList<BaoCao> arr2 = new ArrayList<>();
        while(sc2.hasNextLine()){
            BaoCao x = new BaoCao(sc2.nextLine(), sc2.nextLine());
            arr2.add(x);
        }
        Collections.sort(arr2, new Comparator<BaoCao>(){
            @Override
            public int compare(BaoCao a, BaoCao b){
                if(a.getHours() != b.getHours()){
                    return a.getHours() - b.getHours();
                }
                return a.getMinutes() - b.getMinutes();
            }
        });

        for(BaoCao x : arr2){
            System.out.println(map.get(x.getId()) + x.getGio());
        }
        sc1.close();
        sc2.close();
    }
}
