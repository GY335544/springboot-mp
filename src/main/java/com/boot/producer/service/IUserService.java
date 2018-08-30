package com.boot.producer.service;

import java.io.Serializable;
import java.util.List;

import com.boot.producer.entity.User;
import com.boot.producer.model.UserModel;

import com.boot.common.base.PageReq;
import com.boot.common.base.PageResp;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.mapper.Wrapper;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gy
 * @since 2018-08-27
 */
public interface IUserService extends IService<User> {

    /**
	 * 根据条件分页查询,返回datatables表格数据
	 * @param pageReq
	 * @return PageResp
	 * @author gy
	 */
	public PageResp<UserModel> findPage(PageReq<UserModel> pageReq);
	
    /**
	 * 根据条件查询
	 * @param UserModel
	 * @return List<UserModel>
	 * @author gy
	 */
	public List<UserModel> findList(UserModel model);
	
	/**
	 * 根据条件分页查询
	 * @param Wrapper<User>
	 * @param start
	 * @param limit
	 * @return List<User>
	 * @author gy
	 */
	public List<UserModel> findPage(Wrapper<User> wrapper,int start,int limit);
	
	/**
	 * 新增数据
	 * @param UserModel
	 * @return boolean
	 * @author gy
	 */
	public boolean insert(UserModel model);
	
	/**
	 * 根据主键修改记录
	 * @param UserModel
	 * @return boolean
	 * @author gy
	 */
	public boolean update(UserModel model);
	
	/**
	 * 根据主键删除记录
	 * @param Serializable
	 * @return boolean
	 * @author gy
	 */
	public boolean delById(Serializable id);
	
	/**
	 * 根据主键查找记录
	 * @param Serializable
	 * @return UserModel
	 * @author gy
	 */
	public UserModel findById(Serializable id);
}
