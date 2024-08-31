import java.util.*;
class Student  {
    //Attribute
    private String id;
    private String name;
    private String className;
    private String birth;
    private float gpa;
    //Method
    Student (){
        this.id = this.name = this.className = this.birth = "";
        this.gpa = 0;
    }
    Student(String name, String className, String birth, float gpa) {
        this.id = "B20DCCN001";
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }
    public void chuanHoaBirth (){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.birth = sb.toString();
    }
    public String toString (){
        return this.id + " " + this.name + " " + this.className + " " + this.birth + " " + String.format("%.2f", gpa);
    }

}

public class J04006_KHAI_BAO_LOP_SINH_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        x.chuanHoaBirth();
        System.out.println(x);
        sc.close();
    }
}
/*
Nguyen Hoa Binh
D20CQCN04-B
2/2/2002
2
 */