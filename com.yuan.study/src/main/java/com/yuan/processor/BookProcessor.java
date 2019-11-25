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
 */
@Component
public class BookProcessor implements BeanPostProcessor {

	//后置处理器
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Book) {
			Book book = (Book) bean;
			book.setDateTime(LocalDateTime.of(1999, 12, 12, 12, 12));
			return book;
		}
		return bean;
	}

	//前置处理器
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
