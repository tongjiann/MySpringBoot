package com.xiw;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-28 17:51
 */
public class A {
    @Autowired
    private ApplicationContext  applicationContext;

    @Autowired
    private BeanFactory beanFactory;

    @Override
    public String toString() {
        return "A{" +
                "applicationContext=" + applicationContext +
                ", beanFactory=" + beanFactory +
                '}';
    }
}
