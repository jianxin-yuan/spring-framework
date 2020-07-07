package com.yuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author yuan
 * @date 2019/11/19 6:17 下午
 */
@Service
@Scope("prototype")
public class DemoAService {
	@Autowired
	private DemoBService demoBService;



	public void sss() {
		System.out.println("DemoAService.sss");
		demoBService.aaa();
	}
	public void fff() {
		System.out.println("DemoAService.fff");
	}


}
