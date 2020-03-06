package com.bt.video.interview.service.vo;

/**
 * =========================================================================================
 * <br>
 * (C) Copyright BlueTechnology Digital Technology Inc., Ltd. 2001 All Rights Reserved. <br>
 * 日期 : 2020/02/27 <br>
 * 作者 : Avicii Lin <br>
 * 程式說明: Employee(員工) value object. <br>
 * 程式代碼: EmployeeVO <br>
 * =========================================================================================
 */
public class EmployeeVO {

	private Long id;
	private String empNo;
	private String empName;
	private String account;
	private String pass;
	private String email;
	private String enabled;

	/**
	 * 取得序列編號
	 * 
	 * @return type Long
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 取得員工編號
	 * 
	 * @return type String
	 */
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	/**
	 * 取得員工姓名
	 * 
	 * @return type String
	 */
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 取得帳號
	 * 
	 * @return type String
	 */
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 取得密碼
	 * 
	 * @return type String
	 */
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * 取得郵件地址
	 * 
	 * @return type String
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 取得啟用註記
	 * Y: 啟用中
	 * N: 未啟用
	 * 
	 * @return type String
	 */
	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
}
