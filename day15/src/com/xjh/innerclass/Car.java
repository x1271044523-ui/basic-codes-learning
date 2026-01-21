package com.xjh.innerclass;

public class Car {
    private String name;
    private int age;

    public Car() {
    }

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    private class engine {
        String engineName;
        int engineAge;

        public engine() {
        }

        public engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        /**
         * 获取
         * @return engineName
         */
        public String getEngineName() {
            return engineName;
        }

        /**
         * 设置
         * @param engineName
         */
        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        /**
         * 获取
         * @return engineAge
         */
        public int getEngineAge() {
            return engineAge;
        }

        /**
         * 设置
         * @param engineAge
         */
        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }

    }
}
