/* Service 는 DAO 호출을 담당한다.
 * 
 */
package com.poe.test.emp;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{
	@Inject
	private EmpDAO dao;
	
	@Override
	public int printCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.printCount();
	}
		
}
