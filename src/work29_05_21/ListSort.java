package work29_05_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSort {
    public static void main(String[] args) {
        //float total=0;
        // float m,e;
        ArrayList<StudentSort> studentList = new ArrayList<>();
        studentList.add(new StudentSort("Smrity", 7, 100, 90));
        studentList.add(new StudentSort("Soumo", 4, 50, 65));
        studentList.add(new StudentSort("Mohar", 2, 100, 89));
        studentList.add(new StudentSort("Nayan", 5, 56, 67));
        studentList.add(new StudentSort("prity", 6, 34, 45));


        studentList.sort(Comparator.comparing(StudentSort::getTotal));
        Collections.reverse(studentList);
        System.out.println("ArrayList After Sorting:");

        for (int i = 0; i < studentList.size(); i++) {

            //  m=(studentList.get(i).getMathScore());
            //e=(studentList.get(i).getEngScore());
            //total=m+e;
            print("Name:" + studentList.get(i).getName());
            print("roll:" + studentList.get(i).getRoll());
            print("Result= " + studentList.get(i).getTotal());
            print("");

        }

    }

    private static void print(String str) {
        System.out.println(str);
    }
}
