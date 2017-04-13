package com.sippable.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.math.BigInteger;

@Component
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		MimeMessage message = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body);
			javaMailSender.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String generateRandomPassword() {
		
		SecureRandom random = new SecureRandom();
		String randomString = new BigInteger(130, random).toString(32);
		
		return randomString;
	}

}
