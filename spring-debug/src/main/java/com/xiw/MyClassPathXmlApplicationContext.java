package com.xiw;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-30 17:16
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext() {
        super();
    }

    public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.customizeBeanFactory(beanFactory);
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
    }
}
