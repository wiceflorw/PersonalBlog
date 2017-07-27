package com.wiceflow.entity.dao;


public class SubjectCategory {

	/**
	 * 主体类别编号
	 */
	private Integer categoryNo = null;

	/**
	 * 主体类别名称
	 */
	private String categoryName = null;

	/**
	 * 该类主体数量
	 */
	private Integer categoryNum = null;

	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Integer getCategoryNo() {
		return this.categoryNo;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryNum(Integer categoryNum) {
		this.categoryNum = categoryNum;
	}

	public Integer getCategoryNum() {
		return this.categoryNum;
	}

}