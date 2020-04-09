package com.example.demo;

//import javax.jms.Session;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    //public static void main(String[] args) {

    @Value("${emailPassword}")
    static String emailPassword;
    public static Boolean sendMessage (String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String reasonForContact, String prefferedApptTime, String messsage){

        //System.out.println(emailPassword);

        // Recipient's email ID needs to be mentioned.
        String to = "davidtrom@hotmail.com";
        //String to = "dtrombello@gmail.com";

        // Sender's email ID needs to be mentioned
        //String from = "ddsrwebsite2@gmail.com";
        String from = "drmanjugoyalwebsite@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("drmanjugoyalwebsite@gmail.com", emailPassword);

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Potential Patient Requests Information!");

            // Now set the actual message
            message.setText("Dr. Goyal, \n" +
                    "The following potential patient has filled out their contact information as follows: \n" + "\n" +
                    "Name: " + firstName +" " + lastName + "\n" + "Email: " + email + "\n" + "Phone Number: " + phoneNumber + "\n" +
                    "Date of Birth: " + dateOfBirth + "\n" + "Reason for Contact: " +reasonForContact + "\n" +
                    "Preferred Appointment Time: " + prefferedApptTime + "\n" + "Message: " + messsage + "\n" + "\n" +
                     "Sincerely yours," + "\n" + "\n" + "Website Contact "  );

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
            return true;
        } catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }

    }

}

