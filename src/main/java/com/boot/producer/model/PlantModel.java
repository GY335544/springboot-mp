package com.boot.producer.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * view model
 * @author gy
 *
 */
public class PlantModel implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String farmerName;
	private String goodsName;
	private String goodvarietyName;
	private int areas;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")    
	private Date createTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodvarietyName() {
		return goodvarietyName;
	}
	public void setGoodvarietyName(String goodvarietyName) {
		this.goodvarietyName = goodvarietyName;
	}
	public int getAreas() {
		return areas;
	}
	public void setAreas(int areas) {
		this.areas = areas;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "PlatModel [id=" + id + ", farmerName=" + farmerName + ", goodsName=" + goodsName + ", goodvarietyName="
				+ goodvarietyName + ", areas=" + areas + ", createTime=" + createTime + "]";
	}
}
