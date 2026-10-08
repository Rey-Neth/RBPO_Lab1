package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/text")
	public String getText() {
		return "Текст";
	}
	@GetMapping("/num")
	public int getNumber(){
		return 42;
	}
}
