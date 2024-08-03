package com.instagram.controller;

import java.util.Scanner;

import com.instagram.entity.instagramUser;
import com.instagram.service.InstagramSevice;
import com.instagram.service.InstagramSeviceInterfcae;

public class instagramController implements instagramControllerInterface {
	Scanner s = new Scanner(System.in);

	@Override
	public void ControllerCreateProfile() {
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your email");
		String email=s.next();
		System.out.println("Enter your password");
		String password=s.next();
		instagramUser iu = new instagramUser();
		iu.setName(name);
		iu.setEmail(email);
		iu.setPassword(password);
		InstagramSeviceInterfcae ii = new InstagramSevice();
		int i=ii.createProfileService(iu);
		if(i>0) {
			System.out.println("Profile Created");
		}
		else {
			System.out.println("not Profile Created");	
		}
		
	
		// TODO Auto-generated method stub

	}

	@Override
	public void ControllerViewProfile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ControllerLoginProfile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ControllerDeleteProfile() {
		// TODO Auto-generated method stub

	}

}
