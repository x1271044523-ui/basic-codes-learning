package com.xjh.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame() {
        initJFrame();
        initView();
        this.setVisible(true);
    }

    private void initView() {
        // TODO: 这里以后写注册相关的按钮和输入框
    }

    private void initJFrame() {
        // 设置宽高
        this.setSize(488, 500);
        // 设置标题
        this.setTitle("拼图游戏 注册");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认布局
        this.setLayout(null);
    }
}