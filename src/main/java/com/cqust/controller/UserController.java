package com.cqust.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cqust.po.User;

@Controller
@RequestMapping("/mvc")
public class UserController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		List<User> list = new ArrayList<>();
		User user1 = new User();
		User user2 = new User();
		user1.setName("aa");
		user2.setName("AA");
		list.add(user1);
		list.add(user2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userlist", list);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}