package com.bible.java.chapter14.donghwan;

public class OrgDvo {
	private int lvl;
	private String orgCode;
	private String orgCodeNm;
	private int sortSeq;
	
	
	public OrgDvo(int lvl, String orgCode, String orgCodeNm, int sortSeq) {
		this.lvl = lvl;
		this.orgCode = orgCode;
		this.orgCodeNm = orgCodeNm;
		this.sortSeq = sortSeq;
	}
	
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCodeNm() {
		return orgCodeNm;
	}
	public void setOrgCodeNm(String orgCodeNm) {
		this.orgCodeNm = orgCodeNm;
	}
	public int getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(int sortSeq) {
		this.sortSeq = sortSeq;
	}
}
