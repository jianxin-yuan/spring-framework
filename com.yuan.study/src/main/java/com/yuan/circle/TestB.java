package com.yuan.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 * @date 2019/11/22 4:52 下午
 */
@Component
public class TestB {

	@Autowired
	private TestC testC;

	//public TestB(TestC testC) {
	//	this.testC = testC;
	//}


	public void setTestC(TestC testC) {
		this.testC = testC;
	}
}
