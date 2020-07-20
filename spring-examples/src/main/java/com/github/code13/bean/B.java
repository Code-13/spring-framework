package com.github.code13.bean;

import org.springframework.stereotype.Component;

/**
 * @author Code13
 * @date 2020-07-14 14:46
 */
@Component
public class B {

	public B(){
		System.out.println("B创建了");
	}

	public void test1(){
		System.out.println("被增强的方法");
	}

}
