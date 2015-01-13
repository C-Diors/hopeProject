package com.diors.moudle.dao.course;


import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.diors.moudle.pojo.course.UserModel;


@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {

	@Resource
	private SessionFactory sessionFactory;
	
	
	public void addUser(UserModel userModel) {
		
		sessionFactory.getCurrentSession().save(userModel);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
