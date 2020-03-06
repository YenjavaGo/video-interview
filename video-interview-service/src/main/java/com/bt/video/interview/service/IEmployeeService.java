package com.bt.video.interview.service;

import com.bt.video.interview.service.vo.EmployeeVO;

public interface IEmployeeService {

	/**
	 * 由序列編號查詢員工資料
	 * 
	 * @param id 序列編號
	 * @return type EmployeeVO
	 */
	public EmployeeVO findEmployeeById(Long id);
}
