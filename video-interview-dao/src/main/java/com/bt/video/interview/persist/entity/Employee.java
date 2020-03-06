package com.bt.video.interview.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * =========================================================================================
 * <br>
 * (C) Copyright BlueTechnology Digital Technology Inc., Ltd. 2001 All Rights Reserved. <br>
 * 日期 : 2020/02/27 <br>
 * 作者 : Avicii Lin <br>
 * 程式說明: Employee(員工) Entity. <br>
 * 程式代碼: Employee <br>
 * =========================================================================================
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee extends BaseEntity {
	private static final long serialVersionUID = 4660778204764657557L;

	@Column(name = "EMP_NO", nullable = false, unique=true)
	private String empNo;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "ACCOUNT")
	private String account;

	@Column(name = "PASS")
	private String pass;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "ENABLED")
	private String enabled;

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
