/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package edu.cqupt.serviceImpl;

import edu.cqupt.service.HelloService;

/**
 * @author wd 2018/12/3.
 */
public class HelloServiceImpl implements HelloService {
    public String hello(String s) {
        return "hello" + s;
    }
}
