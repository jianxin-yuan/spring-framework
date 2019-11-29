package com.yuan.processor;

import com.yuan.entity.Book;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author yuan
 * @date 2019/11/22 2:08 下午
 *
 *  BeanPostProcessor处理器
 *  实现了BeanPostProcessor的类.可以在bean初始化前后(init方法执行前后)对bean进行处理
 */
@Component
public class BookProcessor implements BeanPostProcessor {

	//bean实例化之后调用
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Book) {
			Book book = (Book) bean;
			book.setDateTime(LocalDateTime.of(1999, 12, 12, 12, 12));
			return book;
		}
		return bean;
	}

	//bean实例化之前调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
