package cn.newgxu.serviceImpl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.newgxu.dao.UserMapper;
import cn.newgxu.model.UserModel;
import cn.newgxu.service.UserService;

/**
 * @author generalChow
 * @email 463734522@qq.com
 * 2013年9月17日
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Inject
	private UserMapper  userMapper;
	
	public Logger getLogger() {
		return logger;
	}



	public void setLogger(Logger logger) {
		this.logger = logger;
	}



	/* (non-Javadoc)
	 * @see cn.newgxu.service.UserService#getUserByUN(java.lang.String)
	 */
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public UserModel getUserByUN(String userName) {
		// TODO Auto-generated method stub
		return userMapper.getUserByUN(userName);
	}

}
