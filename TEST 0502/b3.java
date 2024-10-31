import java.util.*;
import java.io.*;

public class b3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> teeen = new HashMap<>();
        while(sc.hasNextLine()){
            String ten = sc.nextLine();
            String[] words = ten.toLowerCase().trim().split("\\s+");
            String name = words[words.length - 1];
            String tendaydu = "";
            for(int i =0; i <words.length-1; i++){
                name += words[i].substring(0,1);
            }
            for(int i =0; i <words.length; i++){
                tendaydu += words[i].substring(0, 1) + words[i].substring(1) + " ";
            }


            if(teeen.containsKey(tendaydu)){
                continue;
            }
            teeen.put(tendaydu, 1);
            if(!map.containsKey(name)){
                System.out.println(name + "@ptit.edu.vn");
                map.put(name, 1);
            }
            else{
                int tanSuat = map.get(name) + 1;
                System.out.println(name + tanSuat + "@ptit.edu.vn");
                map.put(name, tanSuat);
            }
        }
        sc.close();
    }
}
