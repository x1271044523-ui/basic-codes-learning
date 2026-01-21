package com.xjh.ooptest01;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private String gender;
    private String face;



    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role(String name, int blood, String gender, String face) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        this.face = face;

        this.setFace(face);

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        //长相是随机的
        if (gender == "男") {
            face = boyfaces[new Random().nextInt(boyfaces.length)];
        } else if (gender == "女") {
            face = girlfaces[new Random().nextInt(girlfaces.length)];
        }
        this.face = face;
    }

    public Role() {
    }


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }


    //r1攻击r2 r1.attack（r2）
    public void attack(Role r) {
        Random random = new Random();
        int damage = random.nextInt(20) + 1;


        r.setBlood(r.getBlood() - damage);
        //判断血量是否小于0
        if (r.getBlood() <= 0) {
            r.setBlood(0);

        }

//        System.out.println(this.getName() + "攻击了" + r.getName() + "，" +
//                "造成了" + damage + "的伤害，r2剩余血量为" + r.getBlood());


        //攻击随机从attacks_desc中取出一个
        System.out.printf(attacks_desc[random.nextInt(attacks_desc.length)], this.getName(), r.getName());

        //受伤随机从injureds_desc中取出一个
        System.out.printf(injureds_desc[random.nextInt(injureds_desc.length)], r.getName());
        System.out.println();
        System.out.println("造成了" + damage + "的伤害，" + r.getName() + "剩余血量为" + r.getBlood());
    }


}
