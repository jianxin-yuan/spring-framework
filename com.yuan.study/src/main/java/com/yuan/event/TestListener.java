package com.yuan.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author yuan
 * @date 2019/12/3 17:21
 *
 * 自定义的事件监听器,继承ApplicationListener
 */
public class TestListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof TestEvent) {
			TestEvent testEvent = (TestEvent) event;
			testEvent.print();
		}
	}
}
