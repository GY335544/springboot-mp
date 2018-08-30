package com.boot.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseResp<T> implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int ajaxResult;  //0：请求失败、后台异常、业务异常等非正常结果  1：请求成功  2：表单验证不通过的信息  3：登录超时
	
	private List<ErrorMessage> errorMessage;

	private Map<String,T> values ;
	
	/**
	 * 自定义values 头部名称，默认为T的类名
	 */
	private String resultName;
	
	@JsonIgnore
	private T bean ;

	public int getAjaxResult() {
		return ajaxResult;
	}

	public void setAjaxResult(int ajaxResult) {
		this.ajaxResult = ajaxResult;
	}

	public List<ErrorMessage> getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(List<ErrorMessage> errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public void setSingleErrorMessage(String code ,String msg) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setCode(code);
		errorMessage.setMessage(msg);
		List<ErrorMessage> msgs = new ArrayList<ErrorMessage>();
		msgs.add(errorMessage);
		this.errorMessage = msgs;
	}
	
	public void setSingleErrorMessage(ErrorMessage errorMessage) {
		List<ErrorMessage> msgs = new ArrayList<ErrorMessage>();
		msgs.add(errorMessage);
		this.errorMessage = msgs;
	}

	public Map<String,T> getValues() {
		return values;
	}

	public void setValues(Map<String,T> values) {
		this.values = values;
	}
	
	public void setResult(T bean) {
		values = new HashMap<String,T>();
		if(StringUtil.isBlank(this.resultName)&&bean!=null) {
			this.resultName = bean.getClass().getSimpleName();
			setResultName(this.resultName);
		}else if(StringUtil.isBlank(this.resultName)&&bean==null){
			this.resultName = "null";
		}			
		this.values.put(this.resultName, bean);
		setBean(bean);
	}

	public T getBean() {
		return this.values!=null?this.values.get(this.resultName):null;
	}

	public void setBean(T bean) {
		/*values = new HashMap<String,T>();
		if(StringUtil.isBlank(this.resultName)) {
			this.resultName = bean.getClass().getSimpleName();
			setResultName(bean.getClass().getSimpleName());
		}			
		this.values.put(this.resultName, bean);*/
		this.bean = bean;
	}

	/**
	 * 自定义values 头部名称，默认为T的类名
	 */
	public String getResultName() {
		if(StringUtil.isBlank(this.resultName) && null!=bean) {
			this.resultName = bean.getClass().getSimpleName();
		}	
		return this.resultName;
	}

	/**
	 * 自定义values 头部名称，默认为T的类名
	 */
	public void setResultName(String resultName) {
		if(StringUtil.isBlank(resultName) && null!=bean) {
			resultName = bean.getClass().getSimpleName();
		}	
		this.resultName = resultName;
	}

}
