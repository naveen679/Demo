package com.example.League;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//THIS I AM GOING TO PUSH IT TO DEV BRANCH
//SECOND PUSH TO DEV
@Controller
public class Logincontroller {
	@Autowired
	LoginDao ld;
	
	@RequestMapping("/we")
	public String we()
	{
		return "Login";
	}
	
	
	@ResponseBody
	@RequestMapping("/login")
	public String Login(@ModelAttribute("log")Login log,Model md)
	{
		
		boolean c=ld.login(log);
		if(c==true)
		{
			return "Login sucess";
		}
		else
		{
			return "login fail";
		}
		
	}

}
