package com.mybatis.converter;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class BooleanAndIntConverter extends BaseTypeHandler<Boolean>{

	//java(boolean)-->DB(number)
	/*
	 * ps:PreparedStatement对象
	 * i:PreparedStatement对象操作参数的位置
	 * parameter：java值
	 * jdbcType：jdbc操作的数据库类型
	 * (non-Javadoc)
	 * @see org.apache.ibatis.type.BaseTypeHandler#setNonNullParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
	 */
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
			throws SQLException {
		if(parameter) {
			ps.setInt(i,1);
		}else {
			ps.setInt(i,0);
		}
		
	}

	//db(number)-->java(boolean)
	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
		
		int sexNum = rs.getInt(columnName);
		return sexNum == 1 ? true :false;
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		int sexNum = rs.getInt(columnIndex);
		return sexNum == 1 ? true :false;
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		int sexNum = cs.getInt(columnIndex);
		return sexNum == 1 ? true :false;
	}

}
