package com.yuan.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 * @date 2019/11/27 2:29 下午
 * ApplicationContext的注入是在后置处理器的postProcessBeforeInitialization方法中注入的
 * org.springframework.context.support.ApplicationContextAwareProcessor#postProcessBeforeInitialization
 */
@Component
public class DemoApplicationContextAware implements ApplicationContextAware {
	private ApplicationContext applicationContext;


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			this.applicationContext = applicationContext;
	}
}
