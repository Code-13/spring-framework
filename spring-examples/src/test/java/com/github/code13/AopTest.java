package com.github.code13;

import com.github.code13.app.AppConfig;
import com.github.code13.bean.B;
import com.github.code13.factorybean.TestFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AOP测试
 *
 * @author Code13
 * @date 2020-07-14 14:45
 */
class AopTest {

	final AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

	@Test
	void test1(){
		// 创建 IOC 容器
		final B bean = ac.getBean(B.class);
		bean.test1();
		System.out.println(bean.getClass().getName());
	}

	@Test
	void testFactoryBean(){
		//final Object bean = ac.getBean("&testFactoryBean");
		//System.out.println(bean);
		final Object bean1 = ac.getBean("testFactoryBean");
		System.out.println(bean1);
	}

}
