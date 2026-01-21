package com.xjh.student.test;

import com.xjh.student.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    public static final String ADD_STUDENT = "1";
    public static final String DELETE_STUDENT = "2";
    public static final String UPDATE_STUDENT = "3";
    public static final String QUERY_STUDENT = "4";
    public static final String EXIT = "5";

    public static void startStudentSystem() {
        ArrayList<Student> stulist = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();


            switch (choose) {
                case ADD_STUDENT:
                    System.out.println("添加学生");
                    addStudent(stulist);
                    break;
                case DELETE_STUDENT:
                    System.out.println("删除学生");
                    deleteStudent(stulist);
                    break;
                case UPDATE_STUDENT:
                    System.out.println("修改学生");
                    updateStudent(stulist);
                    break;
                case QUERY_STUDENT:
                    System.out.println("查询学生");
                    queryStudent(stulist);
                    break;
                case EXIT:
                    System.out.println("感谢使用，再见！");
                    System.exit(0); // 退出虚拟机，或者用 break loop;
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }

    }

    public static int addStudent(ArrayList<Student> list) {
        //添加学生信息，键盘录入学生信息，保证id唯一
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();

        boolean idExist = isIdExist(list, id);
        if (idExist) {
            System.out.println("该学生已经存在，请重新录入");
            return -1;
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生家庭地址");
        String address = sc.next();

        list.add(new Student(id, name, age, address));
        System.out.println("录入成功");
        return 1;

    }

    public static void deleteStudent(ArrayList<Student> list) {
        //键盘录入需要删除的学生id，若存在则删除，若不存在则返回菜单
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String sid = sc.next();
        boolean idExist = isIdExist(list, sid);
        if (idExist) {
            //存在,则继续删除
            int index = idToIndex(list, sid);
            list.remove(index);
            System.out.println("删除成功");

        } else {
            System.out.println("该学生不存在");
        }

    }

    public static int updateStudent(ArrayList<Student> list) {
        //键盘录入学生id，若存在则继续录入其他信息，若不存在则提示不存在

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        boolean idExist = isIdExist(list, id);
        if (idExist) {
            int index = idToIndex(list, id);
            Student student = list.get(index);


            System.out.println("请输入修改之后的名字");
            String name = sc.next();
            student.setName(name);

            System.out.println("请输入修改之后的年龄");
            int age = sc.nextInt();
            student.setAge(age);

            System.out.println("请输入修改之后的家庭地址");
            String address = sc.next();
            student.setAddress(address);

            System.out.println("修改完毕!");

        } else {
            System.out.println("该id不存在");

        }


        return -1;

    }

    public static void queryStudent(ArrayList<Student> list) {
        //打印所有学生信息
        //如果没有学生，则提示当前没有学生，请录入之后再查询
        //如果有则打印所有学生信息
        boolean empty = list.isEmpty();
        if (empty) {
            System.out.println("当前没有学生，请录入之后再查询");
        } else {
            System.out.println("id     姓名    年龄    家庭住址");
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress() + "\t");
                System.out.println();
            }
        }

    }

    public static boolean isIdExist(ArrayList<Student> list, String id) {
        // 直接复用 idToIndex 方法
        int index = idToIndex(list, id);

        // 如果索引不是 -1，说明找到了，也就是存在
        if (index != -1) {
            return true;
        } else {
            return false;
        }
        // 或者更装逼的写法，一行搞定：
        // return idToIndex(list, id) != -1;
    }

    public static int idToIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String sid = student.getId();
            if (sid.equals(id)) {
                return i;
            }

        }
        return -1;
    }
}
