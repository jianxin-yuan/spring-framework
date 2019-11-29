package com.yuan.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 * @date 2019/11/27 2:24 下午
 *
 * 实现BeanFactoryAware接口,重写setBeanFactory,可以拿到BeanFactory.然后就可以拿到spring管理的所有类
 *
 * 初始化DemoServiceAware类的时候会调用
 * org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#invokeAwareMethods方法,
 * 注入BeanFactory
 */
@Component
public class DemoServiceAware implements BeanFactoryAware {
	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void printDemoMsg() {
		beanFactory.getBean(DemoService.class).printDemo();
	}
}
