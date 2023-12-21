package com.bach.devsecondlms.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class MemberController {

	@GetMapping(value = "/signup")
	public String signup() {
		return "member/signup_form";
	}
}
