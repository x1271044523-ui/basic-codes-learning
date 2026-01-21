package com.xjh.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // 判断游戏是否胜利
    boolean victory = false;

    // 1. 定义一个二维数组，用来管理数据 (游戏的核心！)
    // 假设是 4x4 的拼图
    int[][] data = new int[4][4];

    // 记录空白方块在二维数组中的位置 (移动逻辑要用)
    int x = 0;
    int y = 0;

    // 定义图片路径 (你可以改成你有的图片路径)
    String path = "puzzlegame/image/animal/animal3/";

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据 (打乱顺序) -> 这里是你一会要写的核心逻辑！
        initData();

        // 初始化图片 (根据数据画图)
        initImage();

        // 让界面显示
        this.setVisible(true);
    }

    // -----------------------------------------------------------
    // 👇 核心逻辑区域：你要关注的是这里！
    // -----------------------------------------------------------

    // 初始化数据（目前是写死的，你一会儿要改造成“打乱数组”）
    private void initData() {
        // 1. 定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 2. 打乱一维数组中的数据
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            // 获取随机索引
            int index = r.nextInt(tempArr.length);
            // 拿着当前遍历到的数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 3. 把一维数组添加到二维数组中
        // 这一步非常关键！
        for (int i = 0; i < tempArr.length; i++) {
            // 这里的逻辑：
            // data[行][列]
            // 行 = 序号 / 4
            // 列 = 序号 % 4
            if (tempArr[i] == 0) {
                // 如果这个数字是0，我要记录下它现在的坐标！
                // 因为一会儿移动的时候，我们需要知道 0 在哪
                x = i / 4;  // x 代表行索引
                y = i % 4;  // y 代表列索引
            }
            // 赋值
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // 根据 data 数组画图（这个方法不用改，拿着用就行）
    private void initImage() {
        // 清空原本已经出现的所有图片
        this.getContentPane().removeAll();
        if (victory) {
            ImageIcon winIcon = new ImageIcon("puzzlegame/image/win.png");
            JLabel winLabel = new JLabel(winIcon);
            // 居中位置 (根据你的图片大小调整，这里假设是居中)
            winLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winLabel);
        }

        // 循环遍历二维数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];

                // 创建图片对象
                // 逻辑：如果数字是 0 (或16)，就不显示图片(或者是空白图)
                // 这里假设你的图片名是 1.jpg ~ 15.jpg
                ImageIcon icon = new ImageIcon(path + num + ".jpg");

                // 创建JLabel容器
                JLabel jLabel = new JLabel(icon);

                // 指定图片位置 (x是列*105，y是行*105)
                jLabel.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);

                // 给图片加个边框，好看点
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                // 添加到界面
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        // 刷新界面
        this.getContentPane().repaint();
    }

    // -----------------------------------------------------------
    // 👇 下面是死代码 (UI设置)，不用看，复制粘贴即可
    // -----------------------------------------------------------

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem reGameItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(reGameItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        // 添加键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    // 键盘按下事件 (移动逻辑要写在这里)
    @Override
    public void keyPressed(KeyEvent e) {
        // 如果已经胜利了，就别让人操作了，直接结束方法
        if (victory) {
            return;
        }


        int code = e.getKeyCode();

        if (code == 87) { // 87 是 W 键的码
            // 1. 把 data 数组直接变成胜利状态
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };

            // 2. 修正 x, y 的坐标 (空白在右下角)
            // 这一步很重要！不然下次移动会报错
            x = 3;
            y = 3;

            // 3. 刷新界面
            initImage();

            // 4. (可选) 直接判赢，或者等玩家再动一步判赢
            // 如果想直接判赢，这里也可以手动调用 checkWin逻辑
        }
        // ... else if (code == 37) ...
        if (code == 37) {
            System.out.println("向左移动");
            // TODO: 这里写左移逻辑
            // 1. 边界判断：如果 0 已经在最左边 (y == 0)，就不能再往左移了
            if (y == 0) {
                return; // 直接结束方法，啥也不干
            }
            // 2. 核心逻辑：交换
            // 把 0 (data[x][y]) 和 左边的数字 (data[x][y-1]) 互换
            // a. 把左边的数字赋值给 0 的位置
            data[x][y] = data[x][y - 1];
            // b. 把左边的位置变成 0
            data[x][y - 1] = 0;
            // 3. 更新坐标：0 跑到左边去了，所以 y 要减 1
            y--;
            // 4. 最重要的一步：重新画图！
            // 数据变了，界面不会自动变，必须手动调用这个方法
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            // TODO: 这里写上移逻辑
            if (x == 0) {
                return; // 直接结束方法，啥也不干
            }

            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            // TODO: 这里写右移逻辑
            if (y == 3) {
                return; // 直接结束方法，啥也不干
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            // TODO: 这里写下移逻辑
            if (x == 3) {
                return; // 直接结束方法，啥也不干
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            initImage();
        }
        if (checkWin()) {
            System.out.println("胜利！");
            victory = true;
            // 这里以后可以弹窗或者加载胜利图片
        }
        initImage();
    }

    // 判断是否胜利
    public boolean checkWin() {
        // 1. 定义一个正确顺序的二维数组
        int[][] win = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };

        // 2. 循环遍历 data 数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 3. 比较：如果当前数据 不等于 胜利数据
                if (data[i][j] != win[i][j]) {
                    return false; // 只要有一个不对，直接返回 false
                }
            }
        }

        // 4. 如果循环跑完了都没返回 false，说明全对！
        return true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}