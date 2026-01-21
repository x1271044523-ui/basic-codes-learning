package com.xjh.test;

import java.io.*;

/**
 * @author Ballauma
 */
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("zhangsan",23);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day28_IO\\data\\student.txt"));

        oos.writeObject(stu);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day28_IO\\data\\student.txt"));

        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }




}
