package com.example.League;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginDao {
	@Autowired
	List<Login> log;
	/*@Autowired
	Login lg;*/
	@Autowired
	LoginInterface li;
	
	public boolean login(Login ln)
	{
		/*boolean c=false;
		String username=ln.getUsername();
		String password=ln.getPassword();
		System.out.println(username);
		System.out.println(password);
		System.out.println("these RE IN LIST");
		
		log=li.findAll();
		
		
		for(Login l:log)
		{
			System.out.println(l.getUsername());
			System.out.println(l.getPassword());
			if(l.getUsername().equalsIgnoreCase(username) &&l.getPassword().equalsIgnoreCase(password))
			{
				c=true;
			}
		}*/
		li.save(ln);
		
		return true;
	}
	

}
