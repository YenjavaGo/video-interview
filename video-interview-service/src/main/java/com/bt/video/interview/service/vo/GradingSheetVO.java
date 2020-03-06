package com.bt.video.interview.service.vo;

import java.util.Date;

/**
 * =========================================================================================
 * <br>
 * (C) Copyright BlueTechnology Digital Technology Inc., Ltd. 2001 All Rights Reserved. <br>
 * 日期 : 2020/02/27 <br>
 * 作者 : Avicii Lin <br>
 * 程式說明: GradingSheet(評分表) value object. <br>
 * 程式代碼: GradingSheetVO <br>
 * =========================================================================================
 */
public class GradingSheetVO {

	private Long   id;
	private String sourceNo;
	private String sourceName;
	private String sourceItem;
	private String sourceType;
	private String sourceStatus;
	private String sysUser;
	private Date   systemTime;
	
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
	 * 取得評分表編號
	 * 
	 * @return type String
	 */
	public String getSourceNo() {
		return sourceNo;
	}
	
	public void setSourceNo(String sourceNo) {
		this.sourceNo = sourceNo;
	}
	
	/**
	 * 取得評分表名稱
	 * Ex:
	 * 		一般評分表
	 * 		標準評分表
	 * 		簡易評分表
	 * 
	 * @return type String
	 */
	public String getSourceName() {
		return sourceName;
	}
	
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	/**
	 * 取得評分表內容
	 * 
	 * @return type String
	 */
	public String getSourceItem() {
		return sourceItem;
	}
	
	public void setSourceItem(String sourceItem) {
		this.sourceItem = sourceItem;
	}
	
	/**
	 * 取得評分表類型
	 * 
	 * @return type String
	 */
	public String getSourceType() {
		return sourceType;
	}
	
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	
	/**
	 * 取得評分表啟用狀態
	 * 
	 * @return type String
	 */
	public String getSourceStatus() {
		return sourceStatus;
	}
	
	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}
	
	/**
	 * 取得此評分表的建立者姓名
	 * 
	 * @return type String
	 */
	public String getSysUser() {
		return sysUser;
	}
	
	public void setSysUser(String sysUser) {
		this.sysUser = sysUser;
	}
	
	/**
	 * 取得此評分表的建立時間
	 * 
	 * @return type String
	 */
	public Date getSystemTime() {
		return systemTime;
	}
	
	public void setSystemTime(Date systemTime) {
		this.systemTime = systemTime;
	}
	
}
