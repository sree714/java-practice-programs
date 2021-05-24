package teach23_05_21;


import java.util.*;

public class ExHashMap {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Soumo");
        arrayList.add("Misti");

        Map<Integer, StudentModel> map = new HashMap<>();
        //map.put("1", new StudentModel("Misti", 5, 100));
        //map.put("2", new StudentModel("Soumo", 25, 80));
        for (int i = 0; i < 5; i++) {
            map.put(i, new StudentModel("Misti", i, 100));
        }


        /*for (String key : map.keySet()) {
            // System.out.println("key : " + key);
            //System.out.println("value : " + map.get(key).getName());
        }*/
        print("Enter id: ");
        Scanner sc = new Scanner(System.in);
        printInfo(sc.nextInt(), map);
        //PrintStr.print(map.get("1").getName());
    }

    private static void printInfo(Integer id, Map<Integer, StudentModel> map) {
        if (map.containsKey(id)) {
            print(map.get(id).getName());
            print(map.get(id).getAge() + "");
            print(map.get(id).getMathScore() + "");
        } else {
            System.out.println("key not exist");
        }
    }

    private static void print(String str){
        System.out.println(str);
    }

}
