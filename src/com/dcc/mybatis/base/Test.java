package com.dcc.mybatis.base;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dcc.mybatis.bean.User;
import com.dcc.mybatis.bean.UserCustom;
import com.dcc.mybatis.bean.UserQueryVo;
import com.dcc.mybatis.base.UserMapper;
import com.dcc.mybatis.util.MybatisUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SqlSession session = MybatisUtil.GetSession();
		
		UserMapper usermapper = session.getMapper(UserMapper.class);
		UserQueryVo uq = new UserQueryVo();
		UserCustom uc = new UserCustom();
		uc.setAge(27);
		uc.setName("pa");
		uq.setUserCustom(uc);
		
		User user = usermapper.getUser(uq);
//		List<User> list = usermapper.selectAll();
		System.out.println(user);
	}
}
