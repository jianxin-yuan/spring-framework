package com.yuan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author yuan
 * @date 2019/11/12 6:29 下午
 */
@Service
@Qualifier()
public class TestService {

	public void initsss() {
		System.out.println("TestService.initsss");
	}

	public void test() {
		System.out.println("TestService.testfff");
	}

	public TestService() {
	}

	public TestService(String name) {
		this.name = name;
	}

	public TestService(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	private String name;
	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
