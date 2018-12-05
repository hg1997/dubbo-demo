/**
 * Copyright (C), 2011-2018, 微贷网.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wd 2018/12/3.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        System.in.read();

    }
}
