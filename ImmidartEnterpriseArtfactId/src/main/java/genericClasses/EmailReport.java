package genericClasses;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailReport {

	public static void emailReport() throws EmailException {
		/*// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("mypictures/john.jpg");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Picture of John");
		attachment.setName("John");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("mail.myserver.com");
		email.addTo("jdoe@somewhere.org", "John Doe");
		email.setFrom("me@apache.org", "Me");
		email.setSubject("The picture");
		email.setMsg("Here is the picture you wanted");

		// add the attachment
		email.attach(attachment);

		// send the email
		email.send();*/
		
		
		Email email = new SimpleEmail();
		email.setHostName("outlook.office365.com");
		email.setSmtpPort(993);
		email.setAuthenticator(new DefaultAuthenticator("dinesh.r@immidart.com", "dinEshkumar@r"));
		email.setSSLOnConnect(true);
		email.setFrom("dinesh.r@immidart.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("dinesh.r@immidart.com");
		email.send();
	}

}
