package com.bt.video.interview.persist.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * =========================================================================================
 * <br>
 * (C) Copyright BlueTechnology Digital Technology Inc., Ltd. 2001 All Rights Reserved. <br>
 * 日期 : 2020/02/27 <br>
 * 作者 : Avicii Lin <br>
 * 程式說明: Entity Super Class. You can extends this Class if necessary. <br>
 * 程式代碼: BaseEntity <br>
 * =========================================================================================
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseEntity implements Serializable {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@ManyToOne(targetEntity = Employee.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "CREATE_USER", referencedColumnName = "ID")
	protected Employee createUser;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME")
	protected Date createTime;

	@ManyToOne(targetEntity = Employee.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "UPDATE_USER", referencedColumnName = "ID")
	protected Employee updateUser;

	@UpdateTimestamp
	@Column(name = "UPDATE_TIME")
	protected Date updateTime;

	@Version
	@Column(name = "version")
	protected Long version;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Employee createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Employee getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Employee updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
