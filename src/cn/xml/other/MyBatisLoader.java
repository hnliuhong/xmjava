package cn.xml.other;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisLoader {

	public static void main(String[] args) {
		String resource = "/mybatis.cfg.xml";
		InputStream inputStream = MyBatisLoader.class.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println(sqlSessionFactory);
	}
}
