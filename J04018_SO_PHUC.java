import java.util.*;

class SoPhuc{
    private int thuc, ao;
    //method
    public SoPhuc(int thuc, int ao){
        this.thuc = thuc;
        this.ao = ao;
    }
    public int getThuc(){
        return this.thuc;
    }
    public int getAo(){
        return this.ao;
    }
    public void setThuc(int thuc) {
        this.thuc = thuc;
    }
    public void setAo(int ao) {
        this.ao = ao;
    }
    public SoPhuc getC(SoPhuc B){
        SoPhuc C = new SoPhuc(0, 0);
        C.thuc = this.thuc * this.thuc +this.thuc * B.thuc - this.ao * this.ao - this.ao * B.ao;
        C.ao = 2*this.thuc*this.ao + this.thuc*B.ao + this.ao*B.thuc;
        return C; 
    }
    public SoPhuc getD(SoPhuc B){
        SoPhuc D = new SoPhuc(0, 0);
        D.thuc = (this.thuc + B.thuc)*(this.thuc + B.thuc) - (this.ao + B.ao)*(this.ao + B.ao);
        D.ao = 2*(this.thuc+B.thuc)*(this.ao + B.ao);
        return D;
    }
}

public class J04018_SO_PHUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());

            SoPhuc c = a.getC(b);
            SoPhuc d = a.getD(b);
            String signC = "+";
            if(c.getAo() < 0){
                signC = "-";
                c.setAo(-c.getAo());
            }
            String signD = "+";
            if(d.getAo() < 0){
                signD = "-";
                d.setAo(-d.getAo());
            }
            System.out.print(c.getThuc() + " " + signC + " " + c.getAo() + "i, ");
            System.out.println(d.getThuc() + " " + signD + " " + d.getAo() +"i");
        }
        sc.close();
    }
}