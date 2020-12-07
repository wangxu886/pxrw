package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import com.example.demo.Bean.MessageBean;
import com.example.demo.Bean.cha;

@Component
@Mapper
public interface MessageMapper {
	//查询设备历史数据
	@Select("select id,deviceId,createtime from device where deviceId=#{deviceId}")
	public cha selectMessage(String deviceId);
	//查看设备的最新数据
	@Select("SELECT * FROM device where id=( SELECT MAX(id) FROM device where deviceId=#{deviceId}) ")
	public MessageBean selectmsg2(String deviceId);
}
