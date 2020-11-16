package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.Bean.MessageBean;
import com.example.demo.Bean.departmentbean;
import com.example.demo.Commonmapper.CommonService;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.MessageMapper;

@RestController
public class controller {
	@Autowired
	MessageMapper messagemapper;
	@Autowired
	DepartmentMapper departmentmapper;
	@Autowired
    public CommonService commonservice;
	
	@RequestMapping("/m")
	public String messa(@RequestBody String  message) {
		System.out.println(message);
		JSONObject jsonObject=JSON.parseObject(message);
		String deviceId=jsonObject.getString("deviceId");
		System.out.println(deviceId);
		JSONArray array=jsonObject.getJSONArray("services");
		JSONObject jsonObject1=array.getJSONObject(0);
		JSONObject data=jsonObject1.getJSONObject("data");
		String temp1=data.getString("temp1");
		System.out.println(temp1);
		String vbat=data.getString("vbat");
		System.out.println(vbat);
		String rssi=data.getString("rssi");
		System.out.println(rssi);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String  eventTime= df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
		MessageBean messageBean=new MessageBean(null, deviceId, temp1, vbat, rssi, eventTime);
		messagemapper.InsertBeacon(messageBean);
		MessageBean me=messagemapper.secletMsage(1);
		System.out.println(me);
		return  "0";
	}
	
		@RequestMapping("/dept")
		public String de(@RequestBody String  department) {//获取前端数据
			System.out.println(department);
			JSONObject jsonObject=JSON.parseObject(department);//解析从前端获取的数据
			String username=jsonObject.getString("username");
			System.out.println(username);
			String password=jsonObject.getString("password");
			System.out.println(password);
			departmentbean departmentbean1=new departmentbean(null, username, password);
			departmentmapper.Insertm(departmentbean1);
			departmentbean departmentbean2=new departmentbean(null, username, password);
			departmentmapper.getDeptById(5);
			return departmentbean2.toString();
		}
		
		@GetMapping("/dept/{userid}")
		public departmentbean get(@PathVariable("userid")Integer userid) {
			return departmentmapper.getDeptById(userid);
		}
		
		@GetMapping("/m/{deviceId}")
		public MessageBean getm(@PathVariable("deviceId")String deviceId) {
			return messagemapper.selectMessage(deviceId);
		}
		
		@RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
		    public String login() {
		        return "/login/login";
		    }
		
		@RequestMapping(value = "/loginPage", method = {RequestMethod.POST, RequestMethod.GET})
		    public String login(HttpServletRequest request, HttpSession session) {
		        String username = request.getParameter("username");
		        String password = request.getParameter("password");
		        System.out.println("你输入的用户名为：" + username);
		        System.out.println("你输入的密码为：" + password);
		        session.setAttribute("username", username);
		        if (username == null) {
		            return "redirect:/";
		        } else {
		            return "redirect:/index";
		        }
		    }
		
		@RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
		    public String loginindex() {
		        return "/login/test";
		    }
}	
