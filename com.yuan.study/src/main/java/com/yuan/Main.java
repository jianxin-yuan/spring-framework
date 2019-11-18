package com.yuan;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * @author yuan
 * @date 2019/11/12 6:28 下午
 */
public class Main {
	public static void main(String[] args) throws IOException {
		//ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		//context.getBean(TestService.class).test();

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		TestService bean = factory.getBean(TestService.class);
		bean.test();
		System.out.println(bean.getName());
		System.out.println(bean.getPwd());

		//获取配置的meta标签
		BeanDefinition testServiceDefinition = factory.getBeanDefinition("testService");
		System.out.println("meta sss :"+testServiceDefinition.getAttribute("sss"));

		//工厂方法创建的bean
		UserService userService = factory.getBean(UserService.class);
		userService.xx();


		//如果没有传入传入class和classLoader,则从classPath根路径下加载资源文件
		//ClassPathResource resource = new ClassPathResource("test.xml");
		//如果传入当前类,则从classPath下的当前类的目录下加载资源文件
		//ClassPathResource resource = new ClassPathResource("test.xml", Main.class);
		//System.out.println(resource.getFile().getAbsolutePath());

		//String[] strings = StringUtils.tokenizeToStringArray("name{f{fwq", ",;{");
		//System.out.println(Arrays.toString(strings));
	}
}
