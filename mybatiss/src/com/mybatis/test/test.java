package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.mapper.PersonMapper;



public class test {

	public static void main(String[] args) throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader); 
		SqlSession session = sessionFactory.openSession();
		//queryPersonByusername(session);
		
		//addPerson(session);
		
		//deletePerson(session);
		//updatePersonByusername(session);
		//queryPersonWithHashMap2(session);
		//queryPersonOrderBycolumns(session);
		//queryPersonAll(session);
		
		//该存储过程未实现queryCountBySexWithPro
		//queryCountBySexWithPro(session);
		
		session.close();
	}
	private static void queryCountBySexWithPro(SqlSession session) {
		PersonMapper per = session.getMapper(PersonMapper.class);
		Map<String,Object> map = new HashMap<>();
		map.put("password", "123");
		per.queryCountBySexWithPro(map);
		Object count = map.get("scount");
		
		//System.out.println("ad");
		System.out.println(count);
	}
	private static void queryPersonWithHashMap2(SqlSession session) {
		PersonMapper personmapper = session.getMapper(PersonMapper.class);
		Map<String,Object> map = new HashMap<>();
		map.put("username", "zs");
		List<Person> person =  personmapper.queryPersonWithHashmap(map);
		System.out.println(person);
	}
	private static void queryPersonOrderBycolumns(SqlSession session) {
		PersonMapper personma = session.getMapper(PersonMapper.class);
		List<Person> per = personma.queryPersonOrderBycolumn("id");
		System.out.println(per);
	}
	private static void updatePersonByusername(SqlSession session) {
		PersonMapper personmapper = session.getMapper(PersonMapper.class);
		Person person = new Person();
		person.setUsername("ls");
		person.setPassword("1234");
		personmapper.updatePersonByusername(person);
	}
	private static void deletePerson(SqlSession session) {
		PersonMapper parsonmapper = session.getMapper(PersonMapper.class);
		parsonmapper.delectPersonByusername("ww");
		
	}
	private static void addPerson(SqlSession session) {
		PersonMapper personmapper = session.getMapper(PersonMapper.class);
		Person person = new Person("ww","789",true,5);
		personmapper.insertPerson(person);
		
	}
	private static void queryPersonAll(SqlSession session) {
		PersonMapper personmapper = session.getMapper(PersonMapper.class);
		List<Person> person = personmapper.queryPersonAll();
		System.out.println(person);
		
	}
	private static void queryPersonByusername(SqlSession session) {
		PersonMapper personma = session.getMapper(PersonMapper.class);
		Person person = personma.queryPersonByusername("'zs'");
		System.out.println(person);
	}
	
	
	
}
