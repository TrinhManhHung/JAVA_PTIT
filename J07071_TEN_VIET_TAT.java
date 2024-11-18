import java.io.File;
import java.io.IOException;
import java.util.*;

class Tens{
    private String name;
    //method
    public Tens(String name){
        this.name = name;
    }

    public String vietTat(){
        String[] words = this.name.split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
        }
        return ten;
    }

    public String lastName(){
        String[] words = this.name.split("\\s+");
        String last = words[words.length -1].toLowerCase();
        return last;
    }

    public String firstName(){
        String[] words = this.name.split("\\s+");
        String first = "";
        for(int i =0; i <words.length-1; i++){
            first += words[i].toLowerCase();
        }
        return first;
    }

    public String toString(){
        return this.name;
    }
}

public class J07071_TEN_VIET_TAT {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Tens> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            Tens ten = new Tens(sc.nextLine());
            arr.add(ten);
        }

        Collections.sort(arr, new Comparator<Tens>(){
            @Override
            public int compare(Tens a, Tens b) {
                if(a.lastName().equals(b.lastName()) == false){
                    return a.lastName().compareTo(b.lastName());
                }
                return a.firstName().compareTo(b.firstName());
            }
        });

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            String tmp = "";
            for(int i =0; i <s.length(); i++){
                if(s.charAt(i) != '.'){
                    tmp += s.charAt(i);
                }
            }
            for(Tens x : arr){
                boolean check = true;
                String vietTat = x.vietTat();
                if(vietTat.length() == tmp.length()){
                    for(int i =0; i <tmp.length(); i++){
                        if(tmp.charAt(i) != vietTat.charAt(i) && tmp.charAt(i) != '*'){
                            check = false;
                        }
                    }
                    if(check) System.out.println(x);
                }
            }
        }
        sc.close();
    }
}