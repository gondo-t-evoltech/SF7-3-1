package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PathValiableController {
	// GET かつ [url : /show]
	@GetMapping("show")
	public String showView() {
		// 戻り値は「ビュー名」を返す
		return "show";
	}
}