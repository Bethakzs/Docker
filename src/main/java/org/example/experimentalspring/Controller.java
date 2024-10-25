package org.example.experimentalspring;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class Controller {

	@GetMapping("/test")
	public String tt() {
		return "Test";
	}

	@GetMapping("/test2")
	public String tt2() {
		return "Test2Test2Test2Test2Test2Test2Test2Test2" +
				"Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2Test2";
	}
}
