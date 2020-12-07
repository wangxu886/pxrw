package com.example.demo.Bean;

import java.sql.Timestamp;

public class cha {
	private int id;
	private String deviceId;
	private  Timestamp createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "cha [id=" + id + ", deviceId=" + deviceId + ", createtime=" + createtime + "]";
	}
	public cha(int id, String deviceId, Timestamp createtime) {
		super();
		this.id = id;
		this.deviceId = deviceId;
		this.createtime = createtime;
	}
}
