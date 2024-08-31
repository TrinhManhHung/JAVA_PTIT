import java.util.*;

class Time  {
    //Attribute
    private int hours;
    private int minutes;
    private int seconds;
    //Method
    public Time (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours (){
        return this.hours;
    }
    public int getMinutes (){
        return this.minutes;
    }
    public int getSeconds (){
        return this.seconds;
    }
    public String toString (){
        return this.hours + " " + this.minutes + " " + this.seconds;
    }
}

public class J05033_SAP_XEP_THOI_GIAN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            Time x = new Time (sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare (Time x, Time y){
                if(x.getHours() != y.getHours()){
                    return x.getHours() - y.getHours();
                }
                if(x.getMinutes() != y.getMinutes()){
                    return x.getMinutes() - y.getMinutes();
                }
                return x.getSeconds() - y.getSeconds();
            }
        });

        for(Time x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
3
11 20 20
14 20 14
11 15 12
 */