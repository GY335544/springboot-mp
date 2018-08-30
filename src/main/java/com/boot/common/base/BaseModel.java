package com.boot.common.base;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 状态 0-未生效 1-已生效
	 */
    private String statusFlag = "1";
	
	/**
	 * 创建人
	 */
	protected String createUser;
	
	/**
	 * 创建时间
	 */
	protected Date createTime;
	
	/**
	 * 修改人
	 */
	protected String updateUser;
	
	/**
	 * 修改时间
	 */
	protected Date updateTime;
	
	/**
	 * 冗余遗留的修改时间 .
	 */
	protected Date modifiedTime;
	/**
	 * 冗余遗留的修改用户.
	 */
	protected String modifiedUser;

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }
	


}
