package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Bean.MessageBean;
import com.example.demo.Bean.cha;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.MessageMapper;

@RestController
public class controller {
	@Autowired
	MessageMapper messagemapper;
	@Autowired
	DepartmentMapper departmentmapper;
		//用户登录
		@RequestMapping("/login")
		public int de(@RequestParam ("username") String username,@RequestParam("password") String password) {//获取前端数据
			return departmentmapper.login(username, password);
		}
		//用户登录转到用户设备信息
		@RequestMapping("/log/{id1}")
		public MessageBean in(@PathVariable("id1") int id1) {
			return departmentmapper.union(id1);
		}
		//通过deviceId查看具体设备
		@GetMapping("/m/{deviceId}")
		public cha getmsg(@PathVariable("deviceId")String deviceId) {
			return messagemapper.selectMessage(deviceId);
		}
		//查看具体设备的最新数据
		@GetMapping("/get/{deviceId}")
		public MessageBean getmg(@PathVariable("deviceId")String deviceId) {
			return messagemapper.selectmsg2(deviceId);
		}
}