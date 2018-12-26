/**
 * Copyright (C), 2011-2018, 微贷网.
 */


import edu.cqupt.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wd 2018/12/3.
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");

        String s = helloService.hello("中国");

        System.out.println(s);

        System.in.read();
    }
}
