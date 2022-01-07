package com.example.demo.layer4;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.mail.util.MailConnectException;

@Service
public class MailServiceIMPL implements MailService {

	/*
	 * @Override public void employeeRegistration(String registeredUser, String
	 * registeredUserEmail) { String registerInfo= "Hello "+ registeredUser
	 * +", Your registration is successful!!!"; sendMail(registerInfo,
	 * registeredUserEmail);
	 * 
	 * }
	 */

	@Override
	public void sendMail(String info, String email) {
		String tx = info;
		String fromEmail = "ltibank09@gmail.com"; // requires valid gmail id

		// https://support.google.com/accounts/answer/185833 <-- generate password here
		String password = "hvspmzijdlhxpyim"; // correct password for gmail id
		String toEmail = email;

		String host = "smtp.gmail.com";
		System.out.println("Email Start");
		// tx = "from \n"+fromEmail+"\n\n"+tx;
		Properties props = new Properties();

		/*
		 * props.put("mail.smtp.auth", "true"); props.put("mail.smtp.starttls.enable",
		 * "true"); props.put("mail.smtp.host", host); props.put("mail.smtp.port",
		 * "587"); props.put("mail.smtp.auth", "true");
		 */
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		// props.put("spring.mail.username", email);
		props.put("spring.mail.password", "hvspmzijdlhxpyim");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Message from LTI_Bank");
			message.setText(tx);
//https://support.google.com/accounts/answer/185833
			// send the message
			try {
				Transport.send(message);
				System.out.println("message sent successfully...");
			} catch (MailConnectException e) {
				System.out.println("NETWORK ERROR");
				System.out.println("PLEASE CHECK YOUR INTERNET CONNECTION");
				e.printStackTrace();
			}
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
