package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


//			// Recipient's email ID needs to be mentioned.
//			String to = "dtrombello@gmail.com";
//
//			// Sender's email ID needs to be mentioned
//			String from = "ddsrwebsite2@gmail.com";
//
//			// Assuming you are sending email from through gmails smtp
//			String host = "smtp.gmail.com";
//
//			// Get system properties
//			Properties properties = System.getProperties();
//
//			// Setup mail server
//			properties.put("mail.smtp.host", host);
//			properties.put("mail.smtp.port", "465");
//			properties.put("mail.smtp.ssl.enable", "true");
//			properties.put("mail.smtp.auth", "true");
//
//			// Get the Session object.// and pass username and password
//			Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
//
//				protected PasswordAuthentication getPasswordAuthentication() {
//
//					return new PasswordAuthentication("ddsrwebsite2@gmail.com", "Password");
//
//				}
//
//			});
//
//			// Used to debug SMTP issues
//			session.setDebug(true);
//
//			try {
//				// Create a default MimeMessage object.
//				MimeMessage message = new MimeMessage(session);
//
//				// Set From: header field of the header.
//				message.setFrom(new InternetAddress(from));
//
//				// Set To: header field of the header.
//				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//				// Set Subject: header field
//				message.setSubject("New Contact Requests Information!");
//
//				// Now set the actual message
//				message.setText("John Smith wants to meet with you to discuss his anxiety");
//
//				System.out.println("sending...");
//				// Send message
//				Transport.send(message);
//				System.out.println("Sent message successfully....");
//			} catch (MessagingException mex) {
//				mex.printStackTrace();
//			}
	}
}


