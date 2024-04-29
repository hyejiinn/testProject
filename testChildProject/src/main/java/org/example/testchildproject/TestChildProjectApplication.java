package org.example.testchildproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestChildProjectApplication
{
	
	public static void main(String[] args)
	{
		SpringApplication.run(TestChildProjectApplication.class, args);
		
		System.out.println("TestChildProjectApplication.main!!!!");
		System.out.println("TEST2 프로젝트에서 수정 진행중 ~_~ ");
	}
	
}
