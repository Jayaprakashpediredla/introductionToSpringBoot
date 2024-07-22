package com.codingshuttle.prakash.week1Intro.introductionToSprintBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSprintBootApplication implements CommandLineRunner {

	//This is a BEAN
	@Autowired
	Apple obj;

	public static void main(String[] args) {

		SpringApplication.run(IntroductionToSprintBootApplication.class, args);

		//Apple obj=new Apple();
		//obj.eatApple();
	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}
}
