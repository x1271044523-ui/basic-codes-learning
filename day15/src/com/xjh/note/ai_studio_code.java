package com.xjh.note;

/**
 * 🎓 接口 (Interface) 核心知识点总结
 * ----------------------------------------------------------------
 * 1️⃣ 接口成员的演变 (JDK 7 -> 8 -> 9)
 * 2️⃣ 接口多态 (解耦神器)
 * 3️⃣ 适配器设计模式 (偷懒神器)
 */
public interface ai_studio_code {

    // ================== 1. 成员变量 ==================
    // 默认修饰符：public static final
    // 意义：接口里没有变量，全是【常量】。
    String NAME = "接口标准"; // 等同于 public static final String NAME = "接口标准";


    // ================== 2. 抽象方法 (JDK 7) ==================
    // 默认修饰符：public abstract
    // 意义：强制实现类必须重写，定义“标准”。
    void method1();


    // ================== 3. 默认方法 (JDK 8) ==================
    // 关键字：default
    // 意义：为了接口升级（向后兼容）。子类可以直接用，也可以重写。
    // 注意：如果有两个接口有同名默认方法，实现类必须强制重写。
    default void method2() {
        System.out.println("我是JDK8引入的，为了不让实现类报错");
        method4(); // 可以调用内部的私有方法
    }


    // ================== 4. 静态方法 (JDK 8) ==================
    // 关键字：static
    // 意义：把工具方法收编进来。
    // 注意：只能用【接口名.方法名】调用，实现类不能继承，也不能通过对象调用。
    static void method3() {
        System.out.println("我是接口里的工具方法");
    }


    // ================== 5. 私有方法 (JDK 9) ==================
    // 关键字：private
    // 意义：抽取默认方法或静态方法中的重复逻辑，不对外暴露。
    private void method4() {
        System.out.println("我是给默认方法打下手的");
    }

    private static void method5() {
        System.out.println("我是给静态方法打下手的");
    }
}

// ====================================================================
// 👇 下面是【接口多态】和【适配器模式】的讲解
// ====================================================================

/**
 * 🦁 知识点二：接口多态
 * <p>
 * 1. 写法：接口类型 变量名 = new 实现类对象();
 * 例如：Swim s = new Dog();
 * <p>
 * 2. 核心用途：
 * - 方法的参数写【接口类型】，可以接收【所有实现该接口的对象】。
 * - 体现了“可插拔”特性（像 USB 插口一样）。
 * <p>
 * 3. 运行规则：
 * - 编译看左边（接口），运行看右边（实现类）。
 */
class TestPolymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        useSwim(d); // 传狗

        // Cat c = new Cat();
        // useSwim(c); // 传猫，只要猫实现了 Swim 接口
    }

    // ⭐ 这个方法的参数是接口类型
    // 好处：不管以后来什么动物，只要会游泳（实现了InterfaceMaster），我就能接！
    public static void useSwim(ai_studio_code i) {
        i.method1(); // 实际运行的是 Dog 重写后的逻辑
    }
}

class Dog implements ai_studio_code {
    @Override
    public void method1() {
        System.out.println("狗在跑");
    }
}


/**
 * 🐢 知识点三：适配器设计模式 (Adapter Pattern)
 * <p>
 * 1. 痛点：
 * - 接口里有 10 个抽象方法。
 * - 我只想用其中 1 个。
 * - 但规则强制我必须重写 10 个（剩下的 9 个空着也很丑）。
 * <p>
 * 2. 解决方案：
 * - 找个中间人（抽象类）把 10 个方法全重写一遍（全是空实现 {}）。
 * - 我继承这个中间人，只重写我关心的那 1 个方法即可。
 * <p>
 * 3. 为什么中间类要是 abstract 的？
 * - 因为它只是个“垫脚石”，没有具体的业务意义，不想让别人 new 它。
 */

// 1. 定义一个有很多方法的接口
interface BigInterface {
    void a();

    void b();

    void c();

    void d();

    void e();
}

// 2. 适配器类（中间人）- 它是抽象的
abstract class InterfaceAdapter implements BigInterface {
    // 空实现，帮子类挡刀
    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }
}

// 3. 真正的使用者
// 只需要继承适配器，重写我想用的 a() 即可，不用管 b,c,d,e
class MyClass extends InterfaceAdapter {
    @Override
    public void a() {
        System.out.println("我只想用方法 a，其他的我不关心，适配器帮我搞定了！");
    }
}