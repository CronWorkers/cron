package com.cronworker.cron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by coupang on 2018. 6. 9..
 */
@Controller
public class HelloController {

	@RequestMapping("/test")
	public String test() {
		return "hello";
	}
}
