import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id, name;
    private int students;
    //method
    public DoanhNghiep(String id, String name, int students){
        this.id = id;
        this.name = name;
        this.students = students;
    }

    @Override
    public int compareTo(DoanhNghiep b){
        return this.id.compareTo(b.id);
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.students;
    }
}

public class J07037_DANH_SACH_DOANH_NGHIEP{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr);

        for(DoanhNghiep x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}