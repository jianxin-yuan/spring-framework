package com.yuan.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 * @date 2019/11/22 4:52 下午
 */
@Component
public class TestA {
	@Autowired
	private TestB testB;

	// 构造器的循环依赖无法解决
	//public TestA(TestB testB) {
	//	this.testB = testB;
	//}


	// setter方法循环依赖可以解决
	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
