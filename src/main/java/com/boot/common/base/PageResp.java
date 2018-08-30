package com.boot.common.base;

import java.io.Serializable;
import java.util.List;

public class PageResp<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	Page<T> values = new Page<T>();

	private int ajaxResult;  //0：请求失败、后台异常、业务异常等非正常结果  1：请求成功  2：表单验证不通过的信息  3：登录超时
	
	private List<ErrorMessage> errorMessage;
	
	public void setResults(List<T> list,int pageNumber,int totalRow) {
		GridResult<T> gridResult = new GridResult<T>();
		if(list!=null) {
			gridResult.setList(list);
		}
		int totalPage = 0;	
		totalPage = (totalRow + gridResult.getPageSize() - 1) / gridResult.getPageSize();
		/*if (totalRow!=0&&totalRow<gridResult.getPageSize()) 
			totalPage=1; 
		else if(totalRow%gridResult.getPageSize()==0)  
			totalPage=totalRow/gridResult.getPageSize(); 
		else if(totalRow%gridResult.getPageSize()!=0) {
			totalPage = totalRow/gridResult.getPageSize()+1;
		}*/
		gridResult.setPageNumber(pageNumber);
		gridResult.setTotalPage(totalPage);
		gridResult.setTotalRow(totalRow);
		Page<T> page = new Page<T>();
		page.setGridResult(gridResult);
		this.setValues(page);
	}
	
	public void setResults(List<T> list,int pageNumber,int pageSize,int totalRow) {
		GridResult<T> gridResult = new GridResult<T>();
		if(list!=null) {
			gridResult.setList(list);
		}
		int totalPage = 0;		
		if (totalRow!=0&&totalRow<pageSize) 
			totalPage=1; 
		else if(totalRow%pageSize==0)  
			totalPage=totalRow/pageSize; 
		else if(totalRow%pageSize!=0) {
			totalPage = totalRow/pageSize+1;
		}
		gridResult.setPageSize(pageSize);
		gridResult.setPageNumber(pageNumber);
		gridResult.setTotalPage(totalPage);
		gridResult.setTotalRow(totalRow);
		Page<T> page = new Page<T>();
		page.setGridResult(gridResult);
		this.setValues(page);
	}

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

	public Page<T> getValues() {
		return values;
	}

	public void setValues(Page<T> values) {
		this.values = values;
	}
  
}
