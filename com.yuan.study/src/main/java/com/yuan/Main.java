package com.yuan;

import com.yuan.custom.MyClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yuan
 * @date 2019/11/12 6:28 下午
 */
public class Main {
	public static void main(String[] args) throws IOException {
		//ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
		//context.getBean(TestService.class).test();

		//XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		//ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext factory = new MyClassPathXmlApplicationContext("applicationContext.xml");

		//TestService bean = factory.getBean(TestService.class);
		//factory.getBean("xxx");
		//bean.test();
		//System.out.println(bean.getName());
		//System.out.println(bean.getPwd());

		//获取配置的meta标签
		//BeanDefinition testServiceDefinition = factory.getBeanDefinition("testService");
		//System.out.println("meta sss :"+testServiceDefinition.getAttribute("sss"));

		//工厂方法创建的bean
		//UserService userService = factory.getBean(UserService.class);
		//userService.xx();


		// 国际化demo
		//Object[] params = new Object[0];
		//String msg1 = factory.getMessage("test", params, Locale.US);
		//String msg2 = factory.getMessage("test", params, Locale.CHINA);
		//System.out.println(msg1);
		//System.out.println(msg2);


		//通过FactoryBean获取bean
		Object book = factory.getBean("book");
		System.out.println(book);
		////获取工厂类本身需要加"&"
		//System.out.println(factory.getBean("&book"));


		//TestEvent testEvent = new TestEvent("TestEvent","test event");
		//factory.publishEvent(testEvent);

		//factory.getBean(DemoAService.class).sss();
		//factory.getBean(DemoBService.class).aaa();

		//如果没有传入传入class和classLoader,则从classPath根路径下加载资源文件
		//ClassPathResource resource = new ClassPathResource("test.xml");
		//如果传入当前类,则从classPath下的当前类的目录下加载资源文件
		//ClassPathResource resource = new ClassPathResource("test.xml", Main.class);
		//System.out.println(resource.getFile().getAbsolutePath());

		//String[] strings = StringUtils.tokenizeToStringArray("name{f{fwq", ",;{");
		//System.out.println(Arrays.toString(strings));


		//factory.getBean(DemoServiceAware.class).printDemoMsg();

		// 测试过滤数据
		//SensitiveDataFilterBeanFactoryPostProcessor beanFactoryPostProcessor = factory.getBean(SensitiveDataFilterBeanFactoryPostProcessor.class);
		//factory.addBeanFactoryPostProcessor(beanFactoryPostProcessor);
		//System.out.println(factory.getBean("user"));

		//factory.getBean(InitializeDemo.class).print();
		//factory.close();
	}
}
