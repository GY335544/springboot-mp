package com.boot.producer.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.common.base.AjaxResult;
import com.boot.common.base.BaseResp;
import com.boot.common.base.BusinessException;
import com.boot.common.base.PageReq;
import com.boot.common.base.PageResp;
import com.boot.producer.model.UserModel;
import com.boot.producer.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *
 * @author gy
 * @since 2018-08-30
 */
@Api(":user API")
@RestController
@RequestMapping("/producer/user")
public class UserController {

	public static final Logger log = LogManager.getLogger(UserController.class);

	@Autowired
	private IUserService userService;
	
	/**
	 * 根据条件分页查询,返回datatables表格数据
	 * @param PageReq
	 * @return PageResp
	 * @author gy
	 */
	@ApiOperation(value = "findPage", notes = "表格分页查询")
	@PostMapping("/findPage")
	public PageResp<UserModel> findPage(@RequestBody PageReq<UserModel> pageReq){
		return userService.findPage(pageReq);
	}
	
	/**
	 * 根据条件查询
	 * @param UserModel
	 * @return BaseResp<List<UserModel>>
	 * @author gy
	 */
	@ApiOperation(value = "findList", notes = "根据条件查询列表")
	@PostMapping("/findList")
	public BaseResp<List<UserModel>> findList(@RequestBody UserModel model){
	    BaseResp<List<UserModel>> resp = new BaseResp<List<UserModel>>();
		try{
	    	List<UserModel> list = userService.findList(model);
	    	resp.setAjaxResult(AjaxResult.SUCCESS);
	    	resp.setResult(list);
		}catch(BusinessException e) {
			//构造返回
			log.error(e.getMessage());
			throw new BusinessException(e);
		}
		return resp;
	}
	
	/**
	 * 新增数据
	 * @param UserModel
	 * @return BaseResp<UserModel>
	 * @throws BusinessException
	 * @author gy
	 */
	@ApiOperation(value = "insert", notes = "新增数据")
	@PostMapping("/insert")
	public BaseResp<UserModel> insert(@RequestBody UserModel model) throws BusinessException{
		BaseResp<UserModel> resp = new BaseResp<UserModel>();
		try{
			//initModel(model);
			boolean result = userService.insert(model);
			if(result){
				resp.setAjaxResult(AjaxResult.SUCCESS);
				resp.setResult(model);
			}else{
				resp.setAjaxResult(AjaxResult.SYSTEM_ERROR);
				resp.setResultName(UserModel.class.getSimpleName());
		    	resp.setSingleErrorMessage(AjaxResult.SYSTEM_ERROR_STR, "新增失败！");
			}
		}catch(BusinessException e) {
			log.error(e.getMessage());
			throw new BusinessException(e);
		}
		return resp;
	}
	
	/**
	 * 根据主键修改记录
	 * @param UserModel
	 * @return BaseResp<UserModel>
	 * @throws BusinessException
	 * @author gy
	 */
    @ApiOperation(value = "update", notes = "根据主键修改记录")
	@PostMapping("/update")
	public BaseResp<UserModel> update(@RequestBody UserModel model) throws BusinessException{
		BaseResp<UserModel> resp = new BaseResp<UserModel>();
		try{
			//initModel(model);
			boolean result = userService.update(model);
			if(result){
				resp.setAjaxResult(AjaxResult.SUCCESS);
				resp.setResult(model);
			}else{
				resp.setAjaxResult(AjaxResult.SYSTEM_ERROR);
				resp.setResultName(UserModel.class.getSimpleName());
		    	resp.setSingleErrorMessage(AjaxResult.SYSTEM_ERROR_STR, "修改失败");
			}
		}catch(BusinessException e) {
			//构造返回
			log.error(e.getMessage());
			throw new BusinessException(e);
		}
		return resp;
	}
	
	/**
	 * 根据主键删除记录
	 * @param Serializable
	 * @return BaseResp<Boolean>
	 * @throws BusinessException
	 * @author gy
	 */
	@ApiOperation(value = "delById", notes = "根据主键删除记录")
	@PostMapping("/delById/{id}")
	public BaseResp<Boolean> delById(@PathVariable("id") String id) throws BusinessException{
		BaseResp<Boolean> resp = new BaseResp<Boolean>();
		try{
			boolean result = userService.delById(id);
			if(result){
				resp.setAjaxResult(AjaxResult.SUCCESS);
				resp.setResultName(UserModel.class.getSimpleName());
				resp.setResult(true);
			}else{
				resp.setAjaxResult(AjaxResult.SYSTEM_ERROR);
				resp.setResultName(UserModel.class.getSimpleName());
		    	resp.setSingleErrorMessage(AjaxResult.SYSTEM_ERROR_STR, "删除失败");
			}
		}catch(BusinessException e) {
			//构造返回
			log.error(e.getMessage());
			throw new BusinessException(e);
		}
		return resp;
	}
	
	/**
	 * 根据主键查找记录
	 * @param Serializable
	 * @return BaseResp<UserModel>
	 * @author gy
	 */
	@ApiOperation(value = "findById", notes = "根据主键查找记录")
	@PostMapping("/findById/{id}")
	public BaseResp<UserModel> findById(@PathVariable("id") String id){
		BaseResp<UserModel> resp = new BaseResp<UserModel>();
		try {
			UserModel model = userService.findById(id);
			resp.setAjaxResult(AjaxResult.SUCCESS);
			resp.setResult(model);
		}catch(BusinessException e) {
			log.error(e.getMessage());
			throw new BusinessException(e);
		}
		return resp;
	}
	
}

