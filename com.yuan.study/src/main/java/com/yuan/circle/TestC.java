package com.yuan.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 * @date 2019/11/22 4:52 下午
 */
@Component
public class TestC {

	@Autowired
	private TestA testA;

	//public TestC(TestA testA) {
	//	this.testA = testA;
	//}


	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
