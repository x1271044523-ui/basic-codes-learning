package com.xjh.reflect;

/**
 * @author Ballauma
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("com.xjh.reflect.Student");
        System.out.println(clazz1);

        // 2. 第二种：类名.class -> 传参用
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        // 3. 第三种：对象.getClass() -> 都有对象了还反什么射？
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

        // 验证：它们是同一个对象吗？(字节码文件在内存里只有一份)
        System.out.println(clazz1 == clazz2);
        // true
        System.out.println(clazz2 == clazz3);
        // true
    }
}
