package com.xjh.note;

import java.util.StringJoiner;

/**
 * 📅 日期：2025-12-21
 * 🎓 主题：String进阶、StringBuilder、StringJoiner
 * -----------------------------------------------------------
 *
 * 1️⃣ String 的底层原理 (面试高频)
 *    1. 不可变性：
 *       - String 的内容一旦创建，不可改变。
 *       - 任何修改操作（如 replace, substring, +拼接）都会产生新的 String 对象。
 *    2. 存储结构：
 *       - JDK 8 及以前：内部是 char[] 字符数组（每个字符占2字节）。
 *       - JDK 9 及以后：内部是 byte[] 字节数组（优化内存，存英文只占1字节）。
 *    3. 字符串常量池 (String Constant Pool)：
 *       - 直接赋值 (String s = "abc")：
 *         会先去串池找。如果有，直接复用地址；如果没有，在串池创建并返回。
 *         (优点：节约内存，速度快)
 *       - new String ("abc")：
 *         不管串池有没有，都会在堆内存单独开辟一块空间。
 *         (缺点：不共享，产生垃圾)
 *
 * -----------------------------------------------------------
 *
 * 2️⃣ StringBuilder (可变字符串)
 *    1. 作用：
 *       - 一个可变的字符容器，专门用于高效拼接字符串。
 *    2. 核心特点：
 *       - 修改内容时，不会创建新对象，而是在原有的容器里修改。
 *       - 效率远高于 String 的 + 号拼接（特别是在循环中）。
 *    3. 常用方法：
 *       - append(任意类型)：添加数据，返回对象本身（支持链式编程）。
 *       - reverse()：反转内容。
 *       - toString()：变回 String 类型。
 *       - length()：获取长度。
 *    4. 场景：
 *       - 字符串拼接、字符串反转。
 *
 * -----------------------------------------------------------
 *
 * 3️⃣ StringJoiner (JDK 8 新特性)
 *    1. 作用：
 *       - 专门用于格式化拼接（自动加间隔符、开始符、结束符）。
 *    2. 构造方法：
 *       - new StringJoiner("间隔符");
 *       - new StringJoiner("间隔符", "开始符", "结束符");
 *         例如：new StringJoiner(", ", "[", "]");
 *    3. 常用方法：
 *       - add(String)：添加元素（注意：目前只能 add 字符串）。
 *       - toString()：获取结果。
 *    4. 优势：
 *       - 替代了以前数组转字符串时繁琐的 if(i == length-1) 判断。
 *
 * -----------------------------------------------------------
 *
 * 🏆 总结与对比：
 *    - String：     【不可变】 只有少量拼接或做常量时使用。
 *    - StringBuilder：【可变】  需要频繁拼接、修改、反转时使用（最常用）。
 *    - StringJoiner： 【可变】  需要特定格式（如 [a, b, c]）拼接时使用，代码最优雅。
 */
public class StringSummary {
    public static void main(String[] args) {
        // --- 演示 StringJoiner 的威力 ---
        
        // 目标：将数组拼接成 [张三, 李四, 王五]
        String[] names = {"张三", "李四", "王五"};

        // 1. 创建 StringJoiner：指定间隔逗号，开始[, 结束]
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        // 2. 添加数据
        for (String name : names) {
            sj.add(name); // 自动处理间隔，不用判断是不是最后一个
        }

        // 3. 输出结果
        System.out.println(sj.toString()); // 输出：[张三, 李四, 王五]
    }
}