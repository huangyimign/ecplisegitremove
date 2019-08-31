package com.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.mybatis.test.Person;

public interface PersonMapper {
	//
	/*
	 * 1.方法名和personmapper.xml文件标签的ID值相同
	 * 2.方法的输入方式和personmapper.xml标签的parameter类型一致
	 * 3.方法的返回值与personmapper.xml标签的resultType类型一致
	 */
	//查寻单个
	Person	queryPersonByusername(String str);
	//查询所有
	List<Person> queryPersonAll();
	//添加数据
	void insertPerson(Person person);
	//删除数据
	void delectPersonByusername(String str);
	//修改数据
	void updatePersonByusername(Person person);
	//排序
	List<Person> queryPersonOrderBycolumn(String str);
	//
	List<Person> queryPersonWithHashmap(Map<String ,Object> map);
	//存储过程来查询
	void queryCountBySexWithPro(Map<String,Object> map);
}
