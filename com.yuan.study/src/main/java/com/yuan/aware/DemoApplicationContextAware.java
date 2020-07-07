package com.yuan.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author yuan
 * @date 2019/11/27 2:29 下午
 * ApplicationContext的注入是在后置处理器的postProcessBeforeInitialization方法中注入的
 * org.springframework.context.support.ApplicationContextAwareProcessor#postProcessBeforeInitialization
 */
@Component
public class DemoApplicationContextAware implements ApplicationContextAware, BeanClassLoaderAware, MessageSourceAware
		, BeanNameAware, BeanFactoryAware, EnvironmentAware, ApplicationEventPublisherAware, EmbeddedValueResolverAware {

	private ApplicationContext applicationContext;


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//todo 获取applicationContext,然后就可以获取所有spring管理的bean
		this.applicationContext = applicationContext;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		//todo 可以获取classLoader
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		//todo 可以获取BeanFactory,然后就可以获取spring管理的所有bean
		//beanFactory.getBean("xxx");
	}

	@Override
	public void setBeanName(String name) {
		//todo 获取beanName
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		//todo 获取messageSource
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		//todo 可以获取applicationEventPublisher. 可以用来发布event
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {

	}

	@Override
	public void setEnvironment(Environment environment) {
		//todo 可以通过environment获取系统的配置信息
	}
}
