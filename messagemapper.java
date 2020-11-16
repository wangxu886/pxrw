package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.demo.Bean.MessageBean;

@Component
@Mapper
public interface MessageMapper {
	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into device(id,deviceId,temp1,vbat,rssi,eventTime) values(#{id},#{deviceId},#{temp1},#{vbat},#{rssi},#{eventTime})")
	public int InsertBeacon(MessageBean message);
	@Select("select * from device where id=#{id}")
	public MessageBean secletMsage(Integer id);
	@Select("select * from device where deviceId=#{deviceId}")
	public MessageBean selectMessage(String deviceId);
}
