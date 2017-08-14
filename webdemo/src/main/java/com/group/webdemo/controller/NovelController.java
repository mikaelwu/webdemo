package com.group.webdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
@SuppressWarnings("unused")
public class NovelController {

	private static Logger logger = Logger.getLogger(NovelController.class);

	@ResponseBody
	@RequestMapping(value = "aaa", produces = "application/json;charset=utf-8")
	public String doFirst() {
		return "一二三";
	}

}
