package com.boot.producer.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.boot.producer.entity.User;
import com.boot.producer.model.UserModel;

import com.boot.producer.mapper.UserMapper;
import com.boot.producer.service.IUserService;

import com.boot.common.base.PageReq;
import com.boot.common.base.PageResp;
import com.boot.common.base.AjaxResult;
import com.boot.utils.ObjectUtil;
import com.boot.common.base.BusinessException;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

import org.springframework.transaction.annotation.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

/**
 *
 * @author gy
 * @since 2018-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
		
	/**
	 *  List<User> to List<UserModel>
	 *  @author gy
	 */
	private List<UserModel> copyList(List<User> list){
		List<UserModel> models = new ArrayList<UserModel>();
		if(list!=null){
			for(User entity:list){
				UserModel model = new UserModel();
				ObjectUtil.copy(entity,model);
				models.add(model);
			}
		}
		return models;
	}
	
	/**
	 * 分页入参构造器
	 * @param pageReq
	 * @return EntityWrapper
	 * @author gy
	 */
	private EntityWrapper<User> createWrapper(PageReq<UserModel> pageReq){
		return createWrapper(pageReq.getModel());
	}
	
	/**
	 * 入参构造器
	 * @param UserModel
	 * @return EntityWrapper
	 * @author gy
	 */
	private EntityWrapper<User> createWrapper(UserModel model){
		EntityWrapper<User> wrapper = new EntityWrapper<User>();
		if(model!=null){
			//默认构造入参
			User entity = new User();
			ObjectUtil.copy(model,entity);
			wrapper.setEntity(entity); 						
			//按需求构造你的入参。。。。。
			
		}
		return wrapper;
	}
	
	/**
	 * 
	 * @author gy
	 */
	@Override
	public PageResp<UserModel> findPage(PageReq<UserModel> pageReq) {
		// TODO Auto-generated method stub
		PageResp<UserModel> pageResp = new PageResp<UserModel> ();
		//构造条件
		EntityWrapper<User> wrapper = createWrapper(pageReq);		
		try {
			//统计总数
			Integer totalRows = this.baseMapper.selectCount(wrapper);
			//排序	
			if(StringUtils.isNotBlank(pageReq.getOrderBy())){
				wrapper.orderBy(pageReq.getOrderBy(), pageReq.getIsAsc());
			}
			//查询
			List<UserModel> list = findPage(wrapper, pageReq.getStart(), pageReq.getPageSize());			
			//构造返回		
			pageResp.setAjaxResult(AjaxResult.SUCCESS);	
			pageResp.setResults(list, pageReq.getPageNo(), pageReq.getPageSize(), totalRows);
		}catch(BusinessException e) {
			throw new BusinessException(e);
		}
		return pageResp;
	}
	
	/**
	 * 
	 * @author l2iu
	 */	
	@Override
	public List<UserModel> findList(UserModel model) {		
		List<User> list = baseMapper.selectList(createWrapper(model));
		return this.copyList(list);			
	}
	
    /**
	 * 
	 * @author gy
	 */
	@Override
	public List<UserModel> findPage(Wrapper<User> wrapper,int start,int limit) {
		// TODO Auto-generated method stub
		List<User> list = baseMapper.selectPage(new RowBounds(start, limit), wrapper);
		return this.copyList(list);
	}

	/**
	 * 
	 * @author gy
	 */
	@Transactional(rollbackFor = Exception.class)	
	@Override
	public boolean insert(UserModel model){
		// TODO Auto-generated method stub			
	    if(null == model.getId()){
		   model.setId(IdWorker.getIdStr());
		}
		User entity = new User();
		ObjectUtil.copy(model,entity);
		return this.insert(entity);			
	}

	/**
	 * 
	 * @author gy
	 */
	@Transactional(rollbackFor = Exception.class)	
	@Override
	public boolean update(UserModel model){
		// TODO Auto-generated method stub		
		User entity = new User();
		ObjectUtil.copy(model,entity);
		return entity.updateById();			
	}

	/**
	 * 
	 * @author gy
	 */
	@Transactional(rollbackFor = Exception.class)	
	@Override
	public boolean delById(Serializable id){
		// TODO Auto-generated method stub
		return this.deleteById(id);		
	}

	/**
	 * 
	 * @author gy
	 */	
	@Override
	public UserModel findById(Serializable id){
		// TODO Auto-generated method stub		
		UserModel model = new UserModel();
		User entity = this.selectById(id);
		ObjectUtil.copy(entity,model);
		return model;
	}
	
}
