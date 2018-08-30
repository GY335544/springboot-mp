package com.boot.common.base;

public class PageReq<T> extends BaseModel {
	
	private static final long serialVersionUID = 1L;

	private int pageNumber = 1;
	private int pageSize = 10;
	private T model; 
	private String sortOrder ; //排序字段 
	private String sortName ; //排序字段 
	
	public int getStart() {
		return (pageNumber-1)*pageSize;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNo() {
		return pageNumber;
	}

	public String getGridQuerySortOrder() {
		return this.getSortOrder();
	}

	public String getGridQuerySortName() {
		return this.getSortName();
	}

	public String getOrderBy() {
		return this.sortName;
	}

	public Boolean getIsAsc() {
		if(this.sortOrder.toLowerCase().equals("asc")) {
			return true;
		}else if(this.sortOrder.toLowerCase().equals("desc")) {
			return false;
		}else {
			return false;
		}
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;		
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
}
