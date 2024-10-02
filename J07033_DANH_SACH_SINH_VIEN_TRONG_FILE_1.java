import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Student{
    private String id, name, className, email;
    //method
    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId(){
        return this.id;
    }

    public void ChuanHoa1 (){
        String[] words = this.name.trim().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
            ten += words[i].substring(1, words[i].length()).toLowerCase() + " ";
        }

        this.name = ten.trim();
    }
    public String toString(){
        ChuanHoa1();
        return this.id + " " + this.name + " " + this.className + " " + this.email;
    }
}
public class J07033_DANH_SACH_SINH_VIEN_TRONG_FILE_1 {
    public static void main(String[] args) throws FileNotFoundException{
        File fi = new File("SINHVIEN.in");
        Scanner sc = new Scanner(fi);

        int n = sc.nextInt(); sc.nextLine();
        ArrayList<Student> arr = new ArrayList<>();

        for(int i =0; i <n; i++){
           Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return a.getId().compareTo(b.getId());
            }
        });

        for(Student x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}

/*
2
B15DCKT150
NGUYEN NGOC SON
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
NguyeN   TrONg Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
 */