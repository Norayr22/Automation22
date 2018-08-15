package com.ole.task.test;

import org.testng.annotations.Test;

import com.ole.task.BASE_Webdriver;
import com.ole.task.RegisterModal;

public class RegisterTest extends BASE_Webdriver  {
	@Test
	public void registerNewUser() throws InterruptedException {
	
	RegisterModal register = new RegisterModal(driver);
	register.registeruser();
    
	
	}

}
