package com.dcc.mybatis.onetomany;

import org.apache.ibatis.session.SqlSession;

import com.dcc.mybatis.bean.Classes;
import com.dcc.mybatis.util.MybatisUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SqlSession session = MybatisUtil.GetSession();
		String statement = "com.dcc.mybatis.onetomany.ClassMapper.getClass";
		String statement2 = "com.dcc.mybatis.onetomany.ClassMapper.getClass2";
		Classes c = session.selectOne(statement2, 2);
		System.out.println(c);
		session.close();
	}

}
