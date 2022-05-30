package com.xiw.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-30 14:47
 */
public class MyAwarePostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + ":进行aware调用");
        return bean;
    }
}
