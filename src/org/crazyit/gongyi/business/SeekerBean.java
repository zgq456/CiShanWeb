package org.crazyit.gongyi.business;

// Generated 2013-11-24 15:02:26 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

public class SeekerBean {
	private Long seekerId;
	private String seekerName;
	private String seekerAddr;
	private String seekerDesc;
	private double needAmount;
	private Double helpAmount;
	private Integer helpCount;
	private Integer browseCount;
	private Date createDate;
	private Date doneDate;
	private int recStatus;
	private String notes;
	private String seekerProv;
	private String seekerZone;
	private Long seekerAdId;

	public SeekerBean() {
	}

	public Long getSeekerId() {
		return seekerId;
	}

	public void setSeekerId(Long seekerId) {
		this.seekerId = seekerId;
	}

	public String getSeekerName() {
		return seekerName;
	}

	public void setSeekerName(String seekerName) {
		this.seekerName = seekerName;
	}

	public String getSeekerAddr() {
		return seekerAddr;
	}

	public void setSeekerAddr(String seekerAddr) {
		this.seekerAddr = seekerAddr;
	}

	public String getSeekerDesc() {
		return seekerDesc;
	}

	public void setSeekerDesc(String seekerDesc) {
		this.seekerDesc = seekerDesc;
	}

	public double getNeedAmount() {
		return needAmount;
	}

	public void setNeedAmount(double needAmount) {
		this.needAmount = needAmount;
	}

	public Double getHelpAmount() {
		return helpAmount;
	}

	public void setHelpAmount(Double helpAmount) {
		this.helpAmount = helpAmount;
	}

	public Integer getHelpCount() {
		return helpCount;
	}

	public void setHelpCount(Integer helpCount) {
		this.helpCount = helpCount;
	}

	public Integer getBrowseCount() {
		return browseCount;
	}

	public void setBrowseCount(Integer browseCount) {
		this.browseCount = browseCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}

	public int getRecStatus() {
		return recStatus;
	}

	public void setRecStatus(int recStatus) {
		this.recStatus = recStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSeekerProv() {
		return seekerProv;
	}

	public void setSeekerProv(String seekerProv) {
		this.seekerProv = seekerProv;
	}

	public String getSeekerZone() {
		return seekerZone;
	}

	public void setSeekerZone(String seekerZone) {
		this.seekerZone = seekerZone;
	}

	public Long getSeekerAdId() {
		return seekerAdId;
	}

	public void setSeekerAdId(Long seekerAdId) {
		this.seekerAdId = seekerAdId;
	}
}
