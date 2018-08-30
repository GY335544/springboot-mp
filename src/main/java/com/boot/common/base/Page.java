package com.boot.common.base;

import java.io.Serializable;

public class Page<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GridResult<T> gridResult;

	public GridResult<T> getGridResult() {
		return gridResult;
	}

	public void setGridResult(GridResult<T> gridResult) {
		this.gridResult = gridResult;
	}
}
