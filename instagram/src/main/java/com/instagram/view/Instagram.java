package com.instagram.view;

import java.util.Scanner;

import com.instagram.controller.instagramController;
import com.instagram.controller.instagramControllerInterface;

public class Instagram {

	public static void main(String[] args) {
		System.out.println("********MainMenu*******");
		System.out.println("click 1 to create profile");
		System.out.println("click 2 to view profile" );
		System.out.println("click 3 to login profile");
		System.out.println("click 4 to delete profile");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = s.nextInt();
		instagramControllerInterface ig = new instagramController();
		switch(n) {
		case 1: ig.ControllerCreateProfile();
		break;
		case 2: ig.ControllerViewProfile();
		break;
		case 3: ig.ControllerLoginProfile();
		break;
		case 4: ig.ControllerDeleteProfile();
		break;
		default: System.out.println("Enter a valid number");
		
		}
		// TODO Auto-generated method stub

	}

}
