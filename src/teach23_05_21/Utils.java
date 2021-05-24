package teach23_05_21;

import java.util.ArrayList;
import java.util.Collections;

public class Utils {
    public static void main(String[] args) {


        String[] arr = new String[5];
        ArrayList<String> name = new ArrayList<>();
        name.add("Soumo");
        name.add("Misti");
        name.add("Smrity");
        name.add("Misti puchu");
        name.add("lol");
        name.add("lol");
        name.add("lol");

        print(name + "");

        /*for (int i = 0; i < name.size(); i++) {
            print(name.get(i));
        }

        print(name.size() + "");

         */


        StudentModel studentModel = new StudentModel("Ram",24,50);
        //print(studentModel.getName());
        //print(studentModel.getAge()+"");

        ArrayList<StudentModel> studentList = new ArrayList<>();
        studentList.add(studentModel);
        studentList.add(new StudentModel("Smrity",24,99));
        studentList.add(new StudentModel("Soumo",25,90));
        studentList.add(new StudentModel("Misti",5,100));

        Collections.reverse(studentList);

        for (int i=0;i<studentList.size();i++){
            print(studentList.get(i).getName());
            print(studentList.get(i).getAge()+"");
            print(studentList.get(i).getMathScore()+"");
            print("");
        }




    }

    private static void print(String str) {
        System.out.println(str);
    }
}
