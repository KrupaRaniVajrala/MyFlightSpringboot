//package com.Admin;
//
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.Admin.entities.AirlineRegisterEntity;
//import com.Admin.repository.AirlineRegisterRepository;
//import com.Admin.service.AirlineRegisterService;
//
//@SpringBootTest
//
//public class TestRepo {
//
//	@Autowired
//	AirlineRegisterService service;
//	
//	@MockBean
//	AirlineRegisterRepository repository;
//	
//	@Test
//	public void testAllAirlines()
//	{
//		Mockito
//			.when(repository.findAll())
//			.thenReturn(
//					Arrays.asList(
//							new AirlineRegisterEntity(1,"AirIndia",35437532,"Hyderabad"),
//							new AirlineRegisterEntity(2,"KingFisher",75845754,"Vizag"),
//							new AirlineRegisterEntity(3,"JetAirways",84563465,"Bangalore")
//							)
//					);
//			List<AirlineRegisterEntity>	reg=service.findAllAirlines();
//					Assertions.assertSame(3,reg.size());
//	}
//	
//	@Test
//    public void testAirlinebyId() {
//		AirlineRegisterEntity airline = new AirlineRegisterEntity();
//		airline.setId(3);
//		Optional<AirlineRegisterEntity> optional = Optional.of(airline);
//		Mockito.when(repository.findById((long) 3)).thenReturn(optional);
//		Assertions.assertSame(3l, airline.getId());
//    }
//	
//}
