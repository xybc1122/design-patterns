package com.principle.demeter.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test1
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/18 10:05
 * 狄米特法则
 **/
public class Test1 {

    public static void main(String[] args) {
        System.out.println("使用狄米特法则改进");
        SchoolManager s = new SchoolManager();
        s.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工
class CollegeEmployee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    public List<CollegeEmployee> printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("----------分公司员工-------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        return list1;
    }
}

//学校的管理类
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;

    }

    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------学校总部员工-------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }

}