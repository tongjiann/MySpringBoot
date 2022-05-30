package com.xiw;

import com.xiw.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-27 11:29
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("myEditorContext.xml");
        Person bean = applicationContext.getBean(Person.class);
        Person p2 = new Person();
        System.out.println(bean);
//        System.out.println("==============");
//        System.out.println(p2);
    }
}
