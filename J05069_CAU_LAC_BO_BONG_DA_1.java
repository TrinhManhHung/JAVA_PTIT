import java.util.*;

class DoiBong {
    private String id, code, name;
    private long price, money;
    //method
    public DoiBong(String id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.money = 0;
    }

    public boolean Solve(String code, long amount){
        if(code.substring(1, 3).equals(this.id)){
            this.code = code;
            this.money += amount * this.price;
            return true;
        }
        return false;
    }

    public String toString(){
        return this.code + " " + this.name + " " + this.money;
    }
}

public class J05069_CAU_LAC_BO_BONG_DA_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<DoiBong> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            sc.nextLine();
            DoiBong x = new DoiBong(sc.nextLine(), sc.nextLine(), sc.nextLong());
            arr.add(x);
        }

        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            String code = sc.next();
            int amount = sc.nextInt();
            for(DoiBong x : arr){
                if(x.Solve(code, amount))
                    System.out.println(x);
            }
        }
        sc.close();
    }
}

/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000

IAC1 AC Milan 960000
EMU2 Manchester United 600000
 */