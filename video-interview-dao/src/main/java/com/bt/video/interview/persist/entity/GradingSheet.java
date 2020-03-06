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
 * 程式說明: GradingSheet(評分表) Entity. <br>
 * 程式代碼: GradingSheet <br>
 * =========================================================================================
 */
@Entity
@Table(name = "GRADING_SHEET")
public class GradingSheet extends BaseEntity {
	private static final long serialVersionUID = -6593885273196326806L;
	
	@Column(name = "SOURCE_NO", length = 10)
	private String sourceNo;
	
	@Column(name = "SOURCE_NAME", length = 50)
	private String sourceName;
	
	@Column(name = "SOURCE_ITEM", length = 1000)
	private String sourceItem;
	
	@Column(name = "SOURCE_TYPE", length = 100)
	private String sourceType;
	
	@Column(name = "SOURCE_STATUS", length = 3)
	private String sourceStatus;

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
	
}
