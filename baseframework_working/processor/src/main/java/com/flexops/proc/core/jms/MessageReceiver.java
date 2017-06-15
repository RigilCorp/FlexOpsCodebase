//package com.flexops.proc.core.jms;
//
//import javax.jms.JMSException;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.MessageHeaders;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageReceiver {
//	static final Logger LOG = LoggerFactory.getLogger(MessageReceiver.class);
//
//	private static final String ORDER_RESPONSE_QUEUE = "order-response-queue";
//
//	@JmsListener(destination = ORDER_RESPONSE_QUEUE)
//	public void receiveMessage(final Message message) throws JMSException {
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		MessageHeaders headers = message.getHeaders();
//		System.out.println("Message:" + message.toString());
//		System.out.println("Application : headers received : {}"+ headers);
//
//	}
//}
