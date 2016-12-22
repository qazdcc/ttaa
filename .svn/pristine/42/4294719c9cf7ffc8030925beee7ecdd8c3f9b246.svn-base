package com.dcc.mybatis.crud;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dcc.mybatis.bean.User;
import com.dcc.mybatis.util.MybatisUtil;

public class CurdTest {
	
	SqlSession session = MybatisUtil.GetSession();

	@Test
	public void insertUser(){
		
		String statement = "com.dcc.mybatis.base.userMapper.insertUser";
		
		int insert = session.insert(statement, new User(-1,"papi",27));
		session.commit();
		System.out.println(insert);
		session.close();
	}
	
	@Test
	public void deleteUser(){
		
		String statement = "com.dcc.mybatis.base.userMapper.deleteUser";
		
		int delete = session.delete(statement, 2);
		session.commit();
		System.out.println(delete);
		session.close();
	}
	
	@Test
	public void updateUser(){
		//绫讳技涓婇潰
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.update(new User(4,"wuyaowang",25));
		session.commit();
		session.close();
	}
	
	//鑾峰緱鎵�湁User
	@Test
	public void getAll() throws IOException{
		
		String statement = "com.dcc.mybatis.base.userMapper.selectAll";
		List<User> list = session.selectList(statement);
		for(User user : list){
			System.out.println(user);
		}
	}
	
}
