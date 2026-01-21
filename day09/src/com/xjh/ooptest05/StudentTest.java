package com.xjh.ooptest05;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建一个长度为3的数组
        Student[] students = new Student[3];

        //2.创建学生对象
        Student student1 = new Student("001", "张三", 18);

        //3.将学生对象添加到数组中
        students[0] = student1;

        //4.再次创建一个学生对象
        Student student2 = new Student("002", "李四", 19);

        //5.唯一性判断
        for (int i = 0; i < students.length; i++) {
            //5.1已经存在 --- 提示重复
            //非空判断
            if (students[i] != null) {
                if (student2.getId() == students[i].getId()) {
                    System.out.println("该学号已存在");
                } else {
                    //5.2不存在 --- 添加学生对象
                    //6.添加学生对象
                    //判断数组是否满了

                    boolean isFull = isFull(students);
                    if (isFull) {
                        //6.1数组已经满了 --- 创建一个新的数组并把老数组的元素复制到新数组中然后添加新的学生对象
                        Student[] newStudents = createNewArray(students, student2);
                    } else {
                        //6.2数组未满 --- 添加学生对象
                        //6.2.1添加学生对象
                        students[i] = student2;
                    }


                }
            }

        }

        //打印数组
        for (int i = 0; i < students.length; i++) {
            //非空判断
            if (students[i] != null) {
                System.out.println(students[i].getId() + students[i].getName());
            }
        }


    }

    public static boolean isFull(Student[] students) {
        //1.判断数组是否未满
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                //数组没满
                //返回true
                return false;

            }
        }
        //数组已满
        //返回false
        return true;

    }

    public static Student[] createNewArray(Student[] students, Student student) {
        //1.创建一个新的数组
        Student[] newStudents = new Student[students.length + 1];
        //2.把老数组的元素复制到新数组中
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        //3.添加新的学生对象
        newStudents[newStudents.length - 1] = student;
        return newStudents;
    }
}
