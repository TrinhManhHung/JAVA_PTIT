import java.util.*;

class SinhVien {
    private String name;
    private int accept, submit;
    //method
    public SinhVien(String name, int accept, int submit) {
        this.name = name;
        this.accept = accept;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getAccept() {
        return accept;
    }

    public int getSubmit() {
        return submit;
    }

    public String toString() {
        return this.name + " " + this.accept + " " + this.submit;
    }
}

public class J05042_BANG_XEP_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1;  i <=n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b) {
                if(a.getAccept() != b.getAccept()){
                    return b.getAccept() - a.getAccept();
                }
                if(a.getSubmit() != b.getSubmit()){
                    return a.getSubmit() - b.getSubmit();
                }
                return a.getName().compareTo(b.getName());
            }
        });

        for(SinhVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
 */