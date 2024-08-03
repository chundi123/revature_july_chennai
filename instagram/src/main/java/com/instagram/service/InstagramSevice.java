package com.instagram.service;

import com.instagram.dataAccessObject.InstagramDAO;
import com.instagram.dataAccessObject.InstagramDAOInterface;
import com.instagram.entity.instagramUser;

public class InstagramSevice implements InstagramSeviceInterfcae {

	public int createProfileService(instagramUser iu) {
		// TODO Auto-generated method stub
		InstagramDAOInterface id = new InstagramDAO();
		int i=id.createProfileDAO(iu);
		
		return i;
	}

}
