package com.github.code13.factorybean;

import com.github.code13.dao.UserDao;
import com.github.code13.dao.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 测试 FactoryBean
 *
 * @author Code13
 * @date 2020-08-04 16:27
 */
@Component
public class TestFactoryBean implements FactoryBean<UserDao> {
	@Override
	public UserDao getObject() throws Exception {
		return new UserDaoImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return UserDao.class;
	}
}
