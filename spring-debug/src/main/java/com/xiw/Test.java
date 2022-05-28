package com.xiw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-27 11:29
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        A bean = applicationContext.getBean(A.class);
        System.out.println(bean.toString());
    }
}
