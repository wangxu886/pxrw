package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.demo.Bean.MessageBean;

@Component
@Mapper
public interface DepartmentMapper {
	//用户登录
	@Select("select userid from department where username=#{username} and password=#{password}")
    public int login(String username, String password);
	//用户登录转到用户设备信息
	@Select("select device.id device.deviceId,device.temp1,device.vbat,device.rssi,device.createtime device.id1"
			+ "from device,department where device.id1=#{id1}=department.userid")
	public MessageBean union(int id1);
}
