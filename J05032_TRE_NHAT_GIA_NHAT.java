import java.util.*;

class Person {
    private String name, birth;
    //method

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public int getYear() {
        return Integer.parseInt(this.birth.substring(6));
    }

    public int getMonth() {
        return Integer.parseInt(this.birth.substring(3, 5));
    }

    public int getDay() {
        return Integer.parseInt(this.birth.substring(0, 2));
    }

    public String getName() {
        return this.name;
    }
}

public class J05032_TRE_NHAT_GIA_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> arr = new ArrayList<>();
        for(int i =0; i <n; i++) {
            Person x = new Person(sc.next(), sc.next());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b) {
                if(a.getYear() != b.getYear()){
                    return b.getYear() - a.getYear();
                }
                if(a.getMonth() != b.getMonth()){
                    return b.getMonth() - a.getMonth();
                }
                return b.getDay() - a.getDay();
            }
        });

        System.out.println(arr.get(0).getName());
        System.out.println(arr.get(n-1).getName());
        sc.close();
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990

Binh
Tam
 */