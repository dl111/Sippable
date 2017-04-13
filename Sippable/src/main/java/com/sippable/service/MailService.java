package com.sippable.service;

public interface MailService {
	
	public void send(String to, String subject, String body);
	public String generateRandomPassword();
	

}
