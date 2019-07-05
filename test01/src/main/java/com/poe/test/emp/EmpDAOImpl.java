/*
 * Mybatis를 담당한다.
 * SqlSession 사용.
 */
package com.poe.test.emp;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO{
	@Inject
	private SqlSession session;
	private static final String namespace=
			"com.poe.test.mappers.empMapper";
	
	@Override
	public int printCount() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".selectEmpCount");
	}

}




