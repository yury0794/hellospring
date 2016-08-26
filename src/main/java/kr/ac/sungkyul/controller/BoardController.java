package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {

	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		return "BoardCountroller:list()";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	@ResponseBody
	public String writeForm() {
		return "BoardCountroller:writeForm()";
	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	@ResponseBody
	public String write() {
		return "BoardCountroller:write()";
	}

	@RequestMapping("/view")
	@ResponseBody
	public String view(@RequestParam(value = "no", required = false, defaultValue = "-1") Long no) {
		return "BoardController:view:" + no;
	}

	@RequestMapping("/delete/{no}")
	@ResponseBody
	public String delete(@PathVariable("no") Long no) {
		return "BoardController:delete:" + no;
	}
}