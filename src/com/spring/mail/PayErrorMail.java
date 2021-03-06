package com.spring.mail;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class PayErrorMail {
	
	
	@Test
	public void sendErrorMail() {
		
		String path="src/com/spring/mail/springmvc-mail.xml"; 
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		MailSender mailSender = (MailSender)context.getBean("mailSender");
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("hwt_19@163.com");
		message.setTo("haowentao@upg.cn");
		message.setText("this is a test mail message");
		message.setSubject("Test Mail Sender");
		message.setSentDate(new Date());
		
		mailSender.send(message);
	}


}
