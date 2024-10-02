import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Subject{
    private String id, name;
    private int tinChi;
    //method
    public Subject(String id, String name, int tinChi){
        this.id = id;
        this.name = name;
        this.tinChi = tinChi;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.tinChi;
    }
}
public class J07034_DANH_SACH_MON_HOC {
    public static void main(String[] args) throws FileNotFoundException{
        File fi = new File("MONHOC.in");
        Scanner sc = new Scanner(fi);

        int n = sc.nextInt();
        ArrayList<Subject> arr = new ArrayList<>();

        for(int i =0; i <n; i++){
            sc.nextLine();
            Subject x = new Subject(sc.nextLine(), sc.nextLine(), sc.nextInt());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<Subject>(){
            @Override
            public int compare(Subject a, Subject b){
                return a.getName().compareTo(b.getName());
            }
        });

        for(Subject x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}