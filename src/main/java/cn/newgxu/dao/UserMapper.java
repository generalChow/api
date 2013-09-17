package cn.newgxu.dao;

import org.apache.ibatis.annotations.Param;

import cn.newgxu.model.UserModel;

/**
 * @author generalChow
 * @email 463734522@qq.com
 * 2013年9月17日
 *
 */
public interface UserMapper {

	public UserModel getUserByUN(@Param("userName") String userName);
}
