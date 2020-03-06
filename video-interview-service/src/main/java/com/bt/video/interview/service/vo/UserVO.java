package com.bt.video.interview.service.vo;

/**
 * =========================================================================================
 * <br>
 * (C) Copyright BlueTechnology Digital Technology Inc., Ltd. 2001 All Rights Reserved. <br>
 * 日期 : 2020/02/27 <br>
 * 作者 : Avicii Lin <br>
 * 程式說明: User login value object. <br>
 * 程式代碼: UserVO <br>
 * =========================================================================================
 */
public class UserVO {

	private String userName;
	private String account;
	private String pass;

	/**
	 * 取得使用者姓名
	 * 
	 * @return type String
	 */
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 取得登入帳號
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
	 * 取得登入密碼
	 * 
	 * @return type String
	 */
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
