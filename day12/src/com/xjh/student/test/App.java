package com.xjh.student.test;

import com.xjh.student.domain.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1. 定义一个集合，用来存管理员账号
        ArrayList<User> userList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("4：退出");
            System.out.println("请输入您的选择：");

            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(userList);
                    break;
                case "2":
                    register(userList);
                    break;
                case "3":
                    forgetPassword(userList);
                    break;
                case "4":
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重试");
            }
        }
    }

    // 先把这三个空方法写出来，保证代码不报错
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        // 1. 生成验证码 & 校验
        String code = getCode();
        System.out.println("验证码：" + code);
        System.out.println("请输入验证码：");
        String inputCode = sc.next();

        if (!code.equalsIgnoreCase(inputCode)) {
            System.out.println("❌ 验证码错误！");
            return; // 直接结束方法，这就回到了 main 方法的菜单
        }

        // 2. 输入用户名密码
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        // 3. 查集合
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String username1 = user.getUsername();
            String password1 = user.getPassword();

            if (username.equals(username1) && password1.equals(password)) {
                flag = true;
                break;
            }
        }

        // 4. 结果
        if (flag) {
            // 启动学生系统
            System.out.println("🎉 登录成功！欢迎使用学生管理系统");
            // 记得去 StudentSystem 把 main 方法改名为 startStudentSystem
            StudentSystem.startStudentSystem();
        } else {
            System.out.println("❌ 用户名或密码错误！");
            // 这里的 return 可写可不写，反正方法也到底了
        }
    }

    private static void register(ArrayList<User> list) {
//        输入用户名：
        Scanner sc = new Scanner(System.in);
        String uname;
//        死循环录入，直到输入正确为止。

        while (true) {
            System.out.println("请输入用户名");
            uname = sc.next();
            //第一关：调用 checkUsername() 检查格式。如果不合格，提示“格式不对”，continue。
            if (!checkUsername(uname)) {
                System.out.println("用户名格式错误");
                continue;
            }
            //第二关：检查唯一性（需要去集合里查）。如果已存在，提示“用户名已存在”，continue。
            if (containsUsername(list, uname)) {
                System.out.println("用户名已存在");
                continue;
            }
            //两关都过了，break 跳出循环，保存用户名。
            break;
        }

        //----------------------------------输入密码-----------------------------
        //死循环录入。
        String pwd;
        while (true) {
            //要求输入两次。如果两次不一致，提示“两次不一致”，continue。
            System.out.println("请输入密码");
            String pwd1 = sc.next();
            System.out.println("请再次输入密码，两次密码需要一致");
            String pwd2 = sc.next();
            if (pwd1.equals(pwd2)) {
                pwd = pwd1;
                break;
            } else {
                System.out.println("两次不一致");
            }
        }
        //------------------------------------身份证----------------------------------
        String pid;
        while (true) {
            //输入身份证：
            System.out.println("请输入身份证");
            String pid1 = sc.next();
            //调用 checkPersonID()。合格则 break。
            if (checkPersonID(pid1)) {
                pid = pid1;
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        //-----------------------------手机号-----------------------------
        String phonenum;
        while (true) {
            System.out.println("请输入手机号");
            String pnum = sc.next();
            if (checkPhoneNumber(pnum)) {
                phonenum = pnum;
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }

//        new User(...) 把上面收集到的数据封装起来。
//        list.add(user) 存入集合。
        User user = new User(uname, pwd, phonenum, pid);
        list.add(user);
//        提示“注册成功”。
        System.out.println("注册成功");
    }

    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();

        // 1. 先找人！(定义一个变量来接住找到的用户)
        User targetUser = null;
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                targetUser = user; // 找到了！记下来
                break; // 找到了就不找了，停！
            }
        }

        // 2. 判断有没有找到
        if (targetUser == null) {
            System.out.println("❌ 未注册，请先注册");
            return; // 方法结束
        }

        // 3. 既然找到了，就开始验证身份
        System.out.println("请输入身份证号");
        String pid = sc.next();
        System.out.println("请输入手机号");
        String phone = sc.next();

        // 拿着 targetUser 的真实数据去比对
        if (pid.equals(targetUser.getPersonID()) && phone.equals(targetUser.getPhone())) {
            System.out.println("请输入新的密码");
            String newPassword = sc.next();

            // 修改密码
            targetUser.setPassword(newPassword);
            System.out.println("🎉 密码修改成功！请重新登录");
        } else {
            System.out.println("❌ 账号信息不匹配，修改失败");
        }
    }

    // 校验用户名格式：格式正确返回 true，否则返回 false
    private static boolean checkUsername(String username) {
        // 1. 校验长度 (3~15位)
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        // 2. 校验内容（只能是字母和数字）
        // 思路：遍历字符串，只要发现有一个字符 "既不是字母也不是数字"，直接 return false
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            // 如果不是 (a-z) 并且 不是 (A-Z) 并且 不是 (0-9)
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        // 3. 校验组合（不能是纯数字）
        // 思路：如果全是数字，或者全是字母(虽然题目没说不能纯字母，但通常要求混合)
        // 题目只说了“不能是纯数字”。
        // 办法：遍历一遍，统计字母的个数。如果字母个数 > 0，说明不是纯数字。
        int letterCount = 0;
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            // 如果是字母，计数器++
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letterCount++;
            }
        }

        // 如果字母个数为 0，说明全是数字，不合格
        if (letterCount == 0) {
            return false;
        }

        // 一路通关，返回 true
        return true;
    }

    private static boolean checkPersonID(String personID) {
        // 1. 校验长度 (必须是 18 位)
        if (personID.length() != 18) {
            return false;
        }

        // 2. 不能以 0 开头
        if (personID.startsWith("0")) { // 或者 charAt(0) == '0'
            return false;
        }

        // 3. 校验前 17 位（必须全是数字）
        for (int i = 0; i < 17; i++) {
            char c = personID.charAt(i);
            // 如果不是数字，返回 false
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        // 4. 校验最后一位（可以是数字，也可以是 X 或 x）
        char endChar = personID.charAt(17);
        // 合法情况：是数字 || 是X || 是x
        if ((endChar >= '0' && endChar <= '9') || endChar == 'X' || endChar == 'x') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkPhoneNumber(String phone) {
        /*长度 11 位。
        不能以 '0' 开头。
        必须全是数字。*/
        if (!(phone.length() == 11)) {
            System.out.println("长度不对");
            //长度不等于11
            return false;
        }
        if (phone.charAt(0) == '0') {
            System.out.println("格式错误，不能0开头");
            //0开头
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            if ((phone.charAt(i) > '9' || phone.charAt(i) < '0')) {
                //不全是数字
                System.out.println("手机号没有字母");
                return false;
            }
        }

        return true;
    }

    private static boolean containsUsername(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uname = user.getUsername();
            if (uname.equals(username)) {
                //已经存在返回true
                return true;
            }
        }
        //循环结束没找到，不存在返回false
        return false;
    }

    private static String getCode() {
        //生成验证码
        //建立字典（素材库）：
        ArrayList<Character> list = new ArrayList<>();

        //你需要一个容器（ArrayList 或者 char[] 都可以），把 a-z，A-Z，0-9 这 62 个字符全部装进去。
        //提示：利用 ASCII 码特性，写两个 for 循环把字母加进去，再写一个循环把数字加进去。
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
        }

        for (int i = 0; i < 26; i++) {
            list.add((char) ('A' + i));
        }

        for (int i = 0; i < 10; i++) {
            list.add((char) ('0' + i));
        }

        //随机抽取：
        //你需要一个 StringBuilder 来存放结果。
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int i1 = r.nextInt(list.size());
            sb.append(list.get(i1));
        }
        String string = sb.toString();
        //写一个循环执行 5次。
        //每次利用 Random 生成一个 0 ~ 集合长度-1 之间的随机索引。
        //根据索引去容器里拿到那个字符，拼接到 StringBuilder 里。
        //返回结果：
        //把 StringBuilder 转成 String 返回。

        return string;
    }
}