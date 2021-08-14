package com.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Admin.entities.BookingEntity;
import com.Admin.service.KafkaConsumerListener;

public class kafkaListenerController {
	@RestController
	@RequestMapping("/api/v7")
	@CrossOrigin
	public class KafkaListenserController {
		
		@Autowired
		private KafkaConsumerListener service;
		
		@GetMapping("reports")
		public List<BookingEntity> getReport() {
			return service.getBookingDetails();
		}
}
}
