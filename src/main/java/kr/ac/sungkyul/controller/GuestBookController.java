package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 메서드 단독 매핑
@Controller
public class GuestBookController {

	@RequestMapping("/guestbook/list")
	@ResponseBody
	// public String list(@RequestParam("page") int page) { 생략해도 되지만 안하는게 좋음
	public String list(@RequestParam int page) {
		System.out.println("page:" + page);
		return "GuestBookCountroller:list()";
	}

	@RequestMapping("/guestbook/deleteform")
	@ResponseBody
	public String deleteForm(@RequestParam(value = "no", required = false, defaultValue = "-1") Long no) {
		// required = false 꼭 no를 넣지 않아도 됨
		// defaultValue를 설정해주어야 한다 -> 스트링 값으로 준다
		System.out.println("no:" + no);
		return "GuestBookCountroller:deleteForm()";
	}
}