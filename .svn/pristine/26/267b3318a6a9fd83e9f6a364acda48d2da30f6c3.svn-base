package com.dcc.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	public static SqlSession GetSession(){
	
    InputStream is = Test.class.getClassLoader().getResourceAsStream("conf.xml");
	SqlSessionFactory  sessionFactory = new SqlSessionFactoryBuilder().build(is);
	SqlSession session = sessionFactory.openSession();
	return session;
	
	}
}

