package com.example.SpringBootTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	
	@RequestMapping("/")
	public String show()
	{
		return "index.jsp";
	}

}
