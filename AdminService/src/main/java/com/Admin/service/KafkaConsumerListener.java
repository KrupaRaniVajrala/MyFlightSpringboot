package com.Admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import com.Admin.entities.BookingEntity;

public class KafkaConsumerListener {

private static final String TOPIC = "booking_topic";
	
	private static List<BookingEntity> bookingDetails=new ArrayList<BookingEntity>();
	
    @KafkaListener(topics = TOPIC, groupId="group_id", containerFactory = "userKafkaListenerFactory")
    public void consumeBookingDetails(BookingEntity booking) {
        System.out.println("Consumed JSON Message: " + booking);
        bookingDetails.add(booking);
        //return booking;
    }
    
    public List<BookingEntity> getBookingDetails()
    {
    	System.out.println("Hello booking:"+bookingDetails);
    	return bookingDetails;
    }
}
