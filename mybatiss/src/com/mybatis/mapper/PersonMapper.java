package com.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.mybatis.test.Person;

public interface PersonMapper {
	//
	/*
	 * 1.��������personmapper.xml�ļ���ǩ��IDֵ��ͬ
	 * 2.���������뷽ʽ��personmapper.xml��ǩ��parameter����һ��
	 * 3.�����ķ���ֵ��personmapper.xml��ǩ��resultType����һ��
	 */
	//��Ѱ����
	Person	queryPersonByusername(String str);
	//��ѯ����
	List<Person> queryPersonAll();
	//�������
	void insertPerson(Person person);
	//ɾ������
	void delectPersonByusername(String str);
	//�޸�����
	void updatePersonByusername(Person person);
	//����
	List<Person> queryPersonOrderBycolumn(String str);
	//
	List<Person> queryPersonWithHashmap(Map<String ,Object> map);
	//�洢��������ѯ
	void queryCountBySexWithPro(Map<String,Object> map);
}
