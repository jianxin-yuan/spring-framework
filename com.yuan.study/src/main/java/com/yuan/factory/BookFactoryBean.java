package com.yuan.factory;

import com.yuan.entity.Book;
import org.springframework.beans.factory.FactoryBean;

import java.util.Map;

/**
 * @author yuan
 * @date 2019/11/21 10:40 上午
 *
 * FactoryBean实现类
 */
public class BookFactoryBean implements FactoryBean<Book> {
	private Map<String, Object> infoMap;

	@Override
	public Book getObject() throws Exception {
		Book book= new Book();
		book.setName((String) infoMap.get("name"));
		book.setAuthor((String) infoMap.get("author"));
		book.setPrice(Integer.valueOf((String) infoMap.get("price")));
		return book;
	}

	@Override
	public Class<?> getObjectType() {
		return Book.class;
	}

	public void setInfoMap(Map<String, Object> infoMap) {
		this.infoMap = infoMap;
	}

	@Override
	public String toString() {
		return "BookFactoryBean{" +
				"infoMap=" + infoMap +
				'}';
	}
}
