package com.xiw.supplier;

import com.xiw.supplier.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-06-13 10:57
 */
public class TestSupplier {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("supplier.xml");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean.getUserName());
    }
}
