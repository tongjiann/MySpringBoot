package com.xiw.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-06-13 10:48
 */
public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
        GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanDefinition;
        genericBeanDefinition.setInstanceSupplier(CreateSupplier::createUser);
        genericBeanDefinition.setBeanClass(User.class);
    }
}
