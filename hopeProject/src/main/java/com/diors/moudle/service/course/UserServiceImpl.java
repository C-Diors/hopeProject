package com.diors.moudle.service.course;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.diors.moudle.dao.course.IUserDAO;
import com.diors.moudle.pojo.course.UserModel;


@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource(name="userDAO")
	private IUserDAO userDao;
	
	
	public IUserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}


	public void addUser(UserModel userModel) {
		userDao.addUser(userModel);
	}

}

