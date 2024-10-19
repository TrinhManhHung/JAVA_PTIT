import java.util.*;

class NhanVien{
    private String id, name;
    private Long sal, day;
    //method
    public NhanVien(String id, String name, long sal, long day){
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.day = day;
    }
    public String getId(){
        return this.id.substring(3);
    }

    public String getGroup(){
        return this.id.substring(3);
    }
    public long getHeSo(){
        int years = Integer.parseInt(this.id.substring(1, 3));
        String group = this.id.substring(0, 1);
        if(years >= 1 && years <= 3){
            if(group.equals("A")) return 10;
            if(group.equals("B")) return 10;
            if(group.equals("C")) return 9;
            else return 8;
        }
        
        if(years <= 8){
            if(group.equals("A")) return 12;
            if(group.equals("B")) return 11;
            if(group.equals("C")) return 10;
            else return 9;
        }

        if(years <= 15){
            if(group.equals("A")) return 14;
            if(group.equals("B")) return 13;
            if(group.equals("C")) return 12;
            else return 11;
        }

        if(group.equals("A")) return 20;
        if(group.equals("B")) return 16;
        if(group.equals("C")) return 14;
        else return 13;
    }

    public long luongThang(){
        return this.sal * this.day * this.getHeSo() * 1000;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.luongThang();
    }
}

public class J05078_BANG_LUONG_THEO_PHONG_BAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Map<String, String> map = new HashMap<String, String>();
        sc.nextLine();
        for(int i =1; i <=m; i++){
            String id = sc.next();
            String room = sc.nextLine().trim();
            map.put(id, room);
        }

        int n = sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            sc.nextLine();
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            arr.add(x);
        }

        sc.nextLine();
        String idGroup = sc.next(); 
        System.out.println("Bang luong phong " + map.get(idGroup) +":");
        for(NhanVien x : arr){
            if(idGroup.equals(x.getGroup())){
                System.out.println(x);
            }
        }
        sc.close();
    }
}
/*

 */