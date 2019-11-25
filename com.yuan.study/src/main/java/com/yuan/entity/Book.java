package com.yuan.entity;

import java.time.LocalDateTime;

/**
 * @author yuan
 * @date 2019/11/21 10:40 上午
 */
public class Book {
	private String name;
	private String author;
	private Integer price;
	private LocalDateTime dateTime;

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				", dateTime=" + dateTime +
				'}';
	}
}
