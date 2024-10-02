
import java.util.*;

class HocPhan{
    private String id, name, group, nameTeacher;
    //method

    public HocPhan(String id, String name, String group, String nameTeacher) {
        this.id = id.trim();
        this.name = name.trim();
        this.group = group.trim();
        this.nameTeacher = nameTeacher.trim();
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getGroup(){
        return this.group;
    }
    public String toString(){
        return this.group + " " + this.nameTeacher;
    }
}

public class J05079_LOP_HOC_PHAN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        ArrayList<HocPhan> arr = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for(int i =1; i <=n; i++){
            HocPhan x = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(x.getId(), x.getName());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<HocPhan>(){
            @Override
            public int compare(HocPhan a, HocPhan b){
                return a.getGroup().compareTo(b.getGroup());
            }
        });

        int m = sc.nextInt(); sc.nextLine();
        while(m-- > 0){
            String code = sc.nextLine().trim();
            System.out.println("Danh sach nhom lop mon " + map.get(code) + ":");
            for(HocPhan x : arr){
                if(x.getId().equals(code)){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}

/*
2
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
1
THCS2D20
 */