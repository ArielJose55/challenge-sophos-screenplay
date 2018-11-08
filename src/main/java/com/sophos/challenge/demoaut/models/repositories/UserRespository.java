package com.sophos.challenge.demoaut.models.repositories;

import com.sophos.challenge.demoaut.models.MailInformation;
import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.models.UserInformation;
import com.sophos.challenge.demoaut.util.PropertiesReader;
import com.sophos.challenge.demoaut.util.exceptions.ReaderPropertiesFailException;

public class UserRespository {
	
	private static final byte PULL_USER = 1;
	private static final byte PULL_MAIL_INFORMATION = 2;
	private static final byte PULL_USER_INFORMATION = 3;
	
	public static User createUser() throws ReaderPropertiesFailException {
		User user = null;
		user = (User) PropertiesReader.pullProperties(PULL_USER);
		user.setMailInformation((MailInformation)PropertiesReader.pullProperties(PULL_MAIL_INFORMATION));
		user.setUserInformation((UserInformation)PropertiesReader.pullProperties(PULL_USER_INFORMATION));
		return user;
	}
}
