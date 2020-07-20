package com.github.code13.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Code13
 * @date 2020-07-14 15:07
 */
@Component
@Aspect
public class AopAspect {

	@Before("within(com.github.code13.bean.*)")
	public void test() {
		System.out.println("我增强了方法");
	}

}
