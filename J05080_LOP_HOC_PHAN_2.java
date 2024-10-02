
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

    public String getNameTeacher(){
        return this.nameTeacher;
    }

    public String getGroup(){
        return this.group;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.group;
    }
}

public class J05080_LOP_HOC_PHAN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        ArrayList<HocPhan> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            HocPhan x = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<HocPhan>(){
            @Override
            public int compare(HocPhan a, HocPhan b){
                if(!a.getId().equals(b.getId())){
                    return a.getId().compareTo(b.getId());
                }
                return a.getGroup().compareTo(b.getGroup());
                
            }
        });

        int m = sc.nextInt(); sc.nextLine();
        while(m-- > 0){
            String code = sc.nextLine().trim();
            System.out.println("Danh sach cho giang vien " + code + ":");
            for(HocPhan x : arr){
                if(x.getNameTeacher().equals(code)){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}

/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
 */