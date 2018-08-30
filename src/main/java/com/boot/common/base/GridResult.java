package com.boot.common.base;


import java.util.List;

/**
 * <p>Description:表格返回数据格式 </p>  
 * @author gy  
 * @date 2018年8月27日 下午2:52:14  
 * @version 1.0
 */
public class GridResult<T> {

	private int pageSize=15;  //每页记录数量 默认记录数 15
	private int pageNumber=1;  //页数 默认页数1
	private int totalRow=0;  //总记录数
	private int totalPage=0;  //总页数
	private List<T> list;  //表格组件值
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
