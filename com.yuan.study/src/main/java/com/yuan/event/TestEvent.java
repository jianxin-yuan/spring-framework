package com.yuan.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author yuan
 * @date 2019/12/3 17:10
 *
 * 事件包装实体.继承 ApplicationEvent
 */
public class TestEvent extends ApplicationEvent {

	private String message;


	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public void print() {
		System.out.println("this is event : msg = "+this.message);
	}
}
