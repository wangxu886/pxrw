package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.demo.Bean.departmentbean;

@Component
@Mapper
public interface DepartmentMapper {

	@Options(useGeneratedKeys = true,keyProperty = "userid")
	@Insert("insert into department(userid,username,password) values(#{userid},#{username},#{password})")
	public int Insertm(departmentbean department);
	@Select("select * from department where userid=#{userid}")
	public departmentbean getDeptById(int userid);
	@Select("select username,password from department where username=#{username} and password=#{password}")
    public String login(@Param("username") String username,@Param("password") String password);
	
}
