package com.boot.producer.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("plant")
public class Plant extends Model<Plant> {

	private static final long serialVersionUID = 1L;

	@TableId("ID")
	private String id;
	@TableField("FARMER_NAME")
	private String farmerName;
	@TableField("GOODS_NAME")
	private String goodsName;
	@TableField("GOODVARIETY_NAME")
	private String goodvarietyName;
	@TableField("AREAS")
	private int areas;
	@TableField("CREATE_TIME")
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
	protected Serializable pkVal() {
		return this.id;
	}

}
