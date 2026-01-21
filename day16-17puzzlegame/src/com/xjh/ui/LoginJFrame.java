package com.xjh.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    // 构造方法
    public LoginJFrame() {
        // 1. 初始化窗体基本设置
        initJFrame();

        // 2. 初始化界面内容 (比如输入框、按钮、背景图)
        // 目前先留空，等你看视频学到添加组件时再往里写
        initView();

        // 3. 让界面显示出来 (必须放在最后)
        this.setVisible(true);
    }

    private void initView() {
        // TODO: 这里以后用来添加用户名、密码输入框和登录按钮
        // 比如：this.getContentPane().add(new JLabel(new ImageIcon("...")));
    }

    private void initJFrame() {
        // 设置宽高 (根据素材大小，通常登录界面是 488x430)
        this.setSize(488, 430);
        // 设置标题
        this.setTitle("拼图游戏 登录");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式 (关闭窗口即停止程序)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认布局 (为了后面能自己用坐标定位置)
        this.setLayout(null);
    }
}