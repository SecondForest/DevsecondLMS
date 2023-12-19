package com.bach.devsecondlms.main.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {

	@GetMapping("/signup")
	public String main() { return "/signup_form.html"; }
}
