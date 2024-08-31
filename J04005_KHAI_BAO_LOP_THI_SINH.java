import java.util.*;

class Student  {
    //Attribute
    private String name;
    private String birth;
    private float mon1;
    private float mon2;
    private float mon3;
    //Method
    Student (String name, String birth, float mon1, float mon2, float mon3){
        this.name = name;
        this.birth = birth;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    
    public String toString (){
        return this.name + " " + this.birth + " " + String.format("%.1f", mon1 + mon2 + mon3);
    }
}

public class J04005_KHAI_BAO_LOP_THI_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(x);
        sc.close();
    }
}
/*
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
 */