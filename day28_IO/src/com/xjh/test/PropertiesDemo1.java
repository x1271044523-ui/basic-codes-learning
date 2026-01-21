package com.xjh.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ballauma
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        System.out.println(prop);


        prop.load(new FileReader("D:\\codes\\basic-codes\\day28_IO\\data\\userinfo"));

        System.out.println(prop);

        String username = prop.getProperty("username");
        String password = prop.getProperty("password");


        System.out.println(username);
        System.out.println(password);
    }
}
