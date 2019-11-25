package com.yuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author yuan
 * @date 2019/11/19 6:17 下午
 */
@Service
@Scope
public class DemoBService {
	@Autowired
	private DemoAService demoAService;

	public void aaa() {
		System.out.println("DemoBService.aaa");
		demoAService.fff();
	}
}
