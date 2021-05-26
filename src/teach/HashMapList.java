package teach;


import java.util.*;

public class HashMapList {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            if(i==0){
                map.put(i, new Employee("ABC", 24, 1000));
            }
           else if(i==1){
                map.put(i, new Employee("soumo", 25, 10000));
            }
           else    if(i==2){
                map.put(i, new Employee("Smrity", 21, 20000));
            }
            else if(i==3){
                map.put(i, new Employee("pqr", 24, 5000));
            }
           else   if(i==4){
                map.put(i, new Employee("DEF", 24, 8000));
            }

        }
        print("Enter id: ");
        Scanner sc = new Scanner(System.in);
        DisplayInfo(sc.nextInt(), map);
    }
    private static void DisplayInfo(Integer id, Map<Integer,Employee> map) {
        if (map.containsKey(id)) {
            print(map.get(id).getName());
            print(map.get(id).getAge() + "");
            print(map.get(id).getSalary() + "");
        }
    }
        private static void print(String str){
            System.out.println(str);
        }
}
