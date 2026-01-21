package com.xjh.a02staticdemo2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student> stuList) {
        // 1. 防御：如果是 null 或者是空集合，直接返回一个默认值（比如 0 或 -1）
        if (stuList == null || stuList.size() == 0) {
            return 0; // 或者抛出一个异常，看具体业务需求
        }
        int maxAge = stuList.get(0).getAge();
        for (int i = 1; i < stuList.size(); i++) {
            Student student = stuList.get(i);
            if (maxAge < student.getAge()) {
                maxAge = student.getAge();
            }

        }
        return maxAge;
    }
}
