package com.xiw.override;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-27 11:29
 */
public class TestMethodOverride {
    /**
     * spring 中默认的矿象都是单例的，spring会在一级缓存中持有该对象，方便下次直接获获取
     * 那么如果是原型作用域的话，会创建一个新的对象
     * 如果想在一个单例模式的bean下引用一个原型模式的bean，怎么办？
     * 在此时就需要引入lookup-method 标签来解决此问题
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("override.xml");
        FruitPlate fruitPlate = (FruitPlate) applicationContext.getBean("fruitPlate");
        fruitPlate.getFruit();
    }
}
