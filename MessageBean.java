package com.example.demo.Bean;

import java.sql.Timestamp;

public class MessageBean {
	private Integer  id;
	private String deviceId;
	private String temp1;
	private String vbat;
	private String rssi;
	private Timestamp createtime;
	private Integer id1;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getVbat() {
		return vbat;
	}
	public void setVbat(String vbat) {
		this.vbat = vbat;
	}
	public String getRssi() {
		return rssi;
	}
	public void setRssi(String rssi) {
		this.rssi = rssi;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Integer getId1() {
		return id1;
	}
	public void setId1(Integer id1) {
		this.id1 = id1;
	}
	@Override
	public String toString() {
		return "MessageBean [id=" + id + ", deviceId=" + deviceId + ", temp1=" + temp1 + ", vbat=" + vbat + ", rssi="
				+ rssi + ", createtime=" + createtime + ", id1=" + id1 + "]";
	}
	public MessageBean(Integer id, String deviceId, String temp1, String vbat, String rssi, Timestamp createtime,
			Integer id1) {
		super();
		this.id = id;
		this.deviceId = deviceId;
		this.temp1 = temp1;
		this.vbat = vbat;
		this.rssi = rssi;
		this.createtime = createtime;
		this.id1 = id1;
	}
}
