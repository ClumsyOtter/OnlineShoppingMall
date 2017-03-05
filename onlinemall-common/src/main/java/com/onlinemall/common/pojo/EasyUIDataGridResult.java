package com.onlinemall.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long total;
	@SuppressWarnings("rawtypes")
	private List rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@SuppressWarnings("rawtypes")
	public List getRows() {
		return rows;
	}

	public void setRows(@SuppressWarnings("rawtypes") List rows) {
		this.rows = rows;
	}
}
