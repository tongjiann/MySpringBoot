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
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("myEditorContext.xml");
        // 两种实现方式，一种是在xml文件中进行配置，另外一种是重写ClassPathXmlApplicationContext，在customizeBeanFactory中进行添加bfpp
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //noinspection resource
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person bean = applicationContext.getBean(Person.class);
//        System.out.println(bean);
    }
}
