/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.roncoo.education.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.bean.User;

/**
 * spring-boot-demo-2-1
 * 
 * @author wujing
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

	@RequestMapping
	public String hello() {
		return "hello world";
	}

	// @RequestParam 简单类型的绑定，可以出来get和post
	@RequestMapping(value = "/get")
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		return map;
	}

	@RequestMapping("/map")
	public HashMap<String, Object> map(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("id", "身份证号码");
		return map;
	}

	// @PathVariable 获得请求url中的动态参数
	@RequestMapping(value = "/get/{id}/{name}")
	public User getUser(@PathVariable int id, @PathVariable String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		return user;
	}

	@RequestMapping("/user/{name}")
	public User getUser1(@PathVariable String name) {
		User user = new User();
		user.setName(name);
		user.setDate(new Date());
		return user;
	}

}
