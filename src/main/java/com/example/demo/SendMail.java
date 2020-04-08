package com.example.demo;

//import javax.jms.Session;
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
       //private String fromEmailAddress = "";
       //private String toEmailAddress = "";


     //public static void main(String[] args) {

    public static Boolean sendMessage (String toEmailAddress, String name, String email, String phonenumber, LocalDate dateOfBirth, String reasonForContact, String prefferedApptTime, String messsage){
         // Recipient's email ID needs to be mentioned.
        String to = toEmailAddress;
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

                return new PasswordAuthentication("drmanjugoyalwebsite@gmail.com", "Password");

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
            message.setSubject("New Contact Requests Information!");

            // Now set the actual message
            message.setText("Dr. Goyal, \n" +
                    "The following potential patient has filled out their contact information as follows: \n" +
                    "Name: " + name + "\n" + "Email: " + email + "\n" + "Phone Number: " + phonenumber + "\n" +
                    "Date of Birth: " + dateOfBirth + "\n" + "Reason for Contact: " +reasonForContact + "\n" +
                    "Preferred Appointment Time: " + prefferedApptTime + "\n" + "Message: " + messsage + "\n");

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

