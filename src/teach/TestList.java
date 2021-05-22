//package com.jwt.core;
package teach;

import java.util.ArrayList;
//import teach.*;


public class TestList {
    public static void main(String[] args) {
        int avgAge = 0;
        Employee emp1 = new Employee(001, "Abc", 12, 1000);
        System.out.println(emp1);
        ArrayList<Employee> employeelist = new ArrayList<>();
         employeelist.add(emp1);
        employeelist.add(new Employee(002, "Smrity", 24, 9000));
        employeelist.add(new Employee(003, "def", 16, 9000));
        employeelist.add(new Employee(004, "tqr", 40, 4000));
        int l = employeelist.size();

        for (int i = 0; i < l; i++) {
            print(employeelist.get(i).getEmpId()+"");
            print(employeelist.get(i).getName());
            print(employeelist.get(i).getAge() + "");
            print(employeelist.get(i).getSalary() + "");

            avgAge = avgAge + employeelist.get(i).getAge();
        }
        int result = avgAge / l;
        print("Average age of all employee is:" + avgAge);
        print("Average age of all employee is:" + result);

    }

    private static void print(String str) {
        System.out.println(str);
    }
}




