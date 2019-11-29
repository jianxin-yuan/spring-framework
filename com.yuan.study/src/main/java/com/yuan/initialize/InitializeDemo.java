package com.yuan.initialize;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 * @date 2019/11/27 3:16 下午
 *
 * 实现InitializingBean,DisposableBean的方法可以实现init,destroy方法
 *
 * 需要注意的是：
 * 		单实例bean：容器启动时创建对象
 * 		多实例bean：每次获取时创建对象
 * 初始化：
 * 		对象创建完成，赋值完成，调用初始化方法
 * 销毁：
 * 		单实例：容器关闭时调用
 * 		多实例：容器不会销毁，只能手动调用销毁方法
 *
 */
@Component
public class InitializeDemo implements InitializingBean, DisposableBean {


	public void print() {
		System.out.println("InitializeDemo.print");
	}

	// 初始化前执行
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializeDemo.afterPropertiesSet");
	}


	// 销毁时执行
	@Override
	public void destroy() throws Exception {
		System.out.println("InitializeDemo.destroy");
	}
}
