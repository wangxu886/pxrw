package com.example.demo.Bean;

public class MessageBean {
	private Integer  id;
	private String deviceId;
	private String temp1;
	private String vbat;
	private String rssi;
	private String eventTime;
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
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	@Override
	public String toString() {
		return "MessageBean [id=" + id + ", deviceId=" + deviceId + ", temp1=" + temp1 + ", vbat=" + vbat + ", rssi="
				+ rssi + ", eventTime=" + eventTime + "]";
	}
	public MessageBean(Integer id, String deviceId, String temp1, String vbat, String rssi, String eventTime) {
		super();
		this.id = id;
		this.deviceId = deviceId;
		this.temp1 = temp1;
		this.vbat = vbat;
		this.rssi = rssi;
		this.eventTime = eventTime;
	}
	
}
