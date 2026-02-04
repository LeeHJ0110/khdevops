package com.kh.app.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionTemplate {
	
	public static SqlSession getSqlSession() throws Exception {
		String resource = "/mybatis/conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(inputStream);
		
		return ssf.openSession(false);
	}
}
