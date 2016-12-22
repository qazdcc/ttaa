package com.dcc.mybatis.differentColumnName;

import org.apache.ibatis.session.SqlSession;

import com.dcc.mybatis.bean.Order;
import com.dcc.mybatis.util.MybatisUtil;

public class Test {

	public static void main(String[] args) {
		SqlSession session = MybatisUtil.GetSession();
		String statement = "com.dcc.mybatis.differentColumnName.OrderMapper.selectOrder";
		Order o = session.selectOne(statement, 2);
		System.out.println(o);
	}
}
