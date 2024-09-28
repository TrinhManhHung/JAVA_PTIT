import java.util.*;

class SinhVien {
    private String id, name, className;
    private int score;
    //method
    public SinhVien(String id, String name, String className){
        this.id = id;
        this.name = name;
        this.className = className;
        this.score = 10;
    }

    public String getId(){
        return this.id;
    }

    public String getClassName(){
        return className;
    }
    
    public void solve(String x){
        for(int i =0; i <x.length(); i++){
            if(x.charAt(i) == 'm') this.score -= 1;
            if(x.charAt(i) == 'v') this.score -= 2;
        }
        
        this.score = Math.max(0, this.score);
    }

    public String toString(){
        if(this.score == 0){
            return this.id + " " + this.name + " " + this.className + " " + this.score + " KDDK";
        }
        return this.id + " " + this.name + " " + this.className + " " + this.score;
    }
}

public class J05075_DIEM_DANH_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();

        //Thong tin sinh vien
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        //Du lieu diem danh
        for(int i =1; i <=n; i++){
            String code = sc.next();
            String data = sc.next();
            for(SinhVien x : arr){
                if(code.equals(x.getId())){
                    x.solve(data);
                }
            }
        }

        String className = sc.next();
        for(SinhVien x : arr){
            if(className.equals(x.getClassName()))
                System.out.println(x);
        }
        sc.close();
    }
}

/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truog Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B

B19DCCN999 Le Cong Minh D19CQAT02-B 0 KDDK
B19DCCN998 Tran Truong Giang D19CQAT02-B 4
B19DCCN997 Nguyen Tuan Anh D19CQCN04-B 6
 */