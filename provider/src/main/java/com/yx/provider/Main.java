package com.yx.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: NMY
 * Date: 17-3-7
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
