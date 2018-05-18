package org.javaindeapth.producer;

import java.io.IOException;
import java.util.Properties;

public class ApplicationClass {
	public static void main(String args[]) {
		Properties properties = new Properties();
		try {
			properties.load(MessageProducer.class.getResourceAsStream("/jms.properties"));
			
			MessageProducer producer = new MessageProducer(properties);
			
			producer.sendMessage("Welcome to Jms");
			
			producer.Close();
		}
		catch (IOException e) {
			System.out.println("could not find jms.properties file");
		}
	}
}
