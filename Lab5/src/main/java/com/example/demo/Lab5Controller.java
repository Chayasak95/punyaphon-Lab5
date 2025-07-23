package com.example.demo;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties.Mode;

@Controller
public class Lab5Controller {

	@GetMapping("/hello")
    public String customer(Model model) {
		//model.addAttribute("ชื่อตัวแปร",ค่า);
		String myName="Chayasak Obchey";
		model.addAttribute("name",myName );
        return "hello"; 
    }
	
}
