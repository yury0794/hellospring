package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blog/*")
public class BlogController {

	@ResponseBody
	@RequestMapping
	public String list(@RequestParam("p") int page, @RequestParam("n") String name) {
		System.out.println("page:" + page);
		System.out.println("name:" + name);
		common();
		return "BlogCountroller:list()";
	}

	@ResponseBody
	@RequestMapping
	public String add() {
		common();
		return "BlogCountroller:add()";
	}

	public void common() {
		System.out.println("common() called");
	}
}