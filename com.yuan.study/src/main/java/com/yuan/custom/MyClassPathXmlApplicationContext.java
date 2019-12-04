package com.yuan.custom;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuan
 * @date 2019/11/27 6:24 下午
 * 自定义applicationContext
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public
	MyClassPathXmlApplicationContext(String... configLocation)  {
		super(configLocation);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.postProcessBeanFactory(beanFactory);
	}

	// 重写此方法,可以设置启动时检查的必须参数,
	// 启动时会检查系统环境变量和java进程变量中是否有这个变量,如果没有.启动会失败.用来检查一些程序运行必须的变量
	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("JAVA_HOME");
	}

	// 重写此方法,可以设置beanFactory的2个属性
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// 设置不允许覆盖BeanDefinition
		//beanFactory.setAllowBeanDefinitionOverriding(false);
		// 设置不允许循环依赖
		//beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}

	//重写此方法,可以在没有传入配置文件的时候启用默认的配置文件.
	@Override
	protected String[] getDefaultConfigLocations() {
		//todo default configure
		return super.getDefaultConfigLocations();
	}

}
