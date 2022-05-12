package com.score.dao;

import com.score.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户登录数据层
 * @author hmg
 *
 */
@Mapper //标识为mybatis数据层接口
public interface UserDao {
	/**
	 *全量查询用户
	 * @param user
	 * @return
	 */
	List<User> getUser(User user);
}
