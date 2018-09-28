package MasterScript1;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	private final static String username = "AutomationVJ@outlook.com";
	private final static String password = "Ovj4519oe26";
	public static void main(String[] args) {

		sendEMail("No Body", "No Subject");
	}

	public static void sendEMail(String emailBody, String subject) {

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp-mail.outlook.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.auth", "true"); 

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("AutomationVJ@outlook.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("AutomationVJ@outlook.com"));
			message.setSubject(subject);
			message.setText(emailBody);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}

