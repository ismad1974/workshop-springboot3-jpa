package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9111111111", "111111");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "922222222", "222222");
		User u3 = new User(null, "Pablo Henrique", "pablo@gmail.com", "93333333333", "333333");
		User u4 = new User(null, "Jonas Cristian", "jonas@gmail.com", "9444444444", "444444");
		User u5 = new User(null, "Felipe Castanhalli", "felipe@gmail.com", "95555555555", "555555");
		User u6 = new User(null, "Gustavo Oliveira", "gustavo@gmail.com", "966666666", "666666");
		User u7 = new User(null, "Anna Tereza", "ana@gmail.com", "977777777", "777777");
		User u8 = new User(null, "Fabiano Medeiros", "fabiano@gmail.com", "999999999", "888888");
		User u9 = new User(null, "Sonia Maria", "sonia@gmail.com", "988888888", "999999");
		User u10 = new User(null, "Maria Lucia", "maria@gmail.com", "900000000", "121212");

		User[] listUsers = { u1, u2, u3, u4, u5, u6, u7, u8, u9, u10 };
		userRepository.saveAll(Arrays.asList(listUsers));

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u3);
		Order o5 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u3);
		Order o6 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u4);
		Order o7 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1);
		Order o8 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u2);
		Order o9 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u3);
		Order o10 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u4);

		Order[] listOrders = { o1, o2, o3, o4, o5, o6, o7, o8, o9, o10 };
		orderRepository.saveAll(Arrays.asList(listOrders));

	}

}
