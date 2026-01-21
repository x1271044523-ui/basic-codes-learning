package com.xjh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Ballauma
 */
public class ProxyUtil {
    /**
     * 方法作用：给一个大明星，这就给他生成一个经纪人
     *
     * @param bigStar 被代理的大明星对象
     * @return 生成的代理对象 (经纪人)
     */
    public static Star createProxy(BigStar bigStar) {

        // 🌟 核心方法：Proxy.newProxyInstance
        // 参数1：类加载器 (用谁加载？用大明星的就行)
        // 参数2：接口列表 (经纪人要像谁？像大明星，所以要实现 Star 接口)
        // 参数3：处理器 (经纪人具体怎么干活？逻辑写在这里)

        Star starProxy = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                // 参数1
                new Class[]{Star.class},
                // 参数2 (注意是数组)
                new InvocationHandler() {
                    // 参数3 (匿名内部类)
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                         * proxy: 代理对象本身 (一般不用)
                         * method: 正在调用的方法对象 (比如 sing 方法)
                         * args: 方法传进来的参数 (比如 "只因你太美")
                         */

                        // --- 1. 经纪人干的事 (增强功能) ---
                        if ("sing".equals(method.getName())) {
                            System.out.println("【经纪人】：准备场地，收钱！");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("【经纪人】：准备伴舞，收钱！");
                        }

                        // --- 2. 让大明星亲自干活 (使用反射) ---
                        // 相当于：bigStar.sing("只因你太美")
                        Object result = method.invoke(bigStar, args);

                        // --- 3. 善后工作 ---
                        System.out.println("【经纪人】：收拾器材，开发票。\n");

                        // 4. 返回明星干活的结果
                        return result;
                    }
                }
        );

        return starProxy;

    }
}