package net.javaguide.springboot.demo;

import net.javaguide.springboot.demo.model.Location;
import net.javaguide.springboot.demo.model.User;
import net.javaguide.springboot.demo.repository.LocationRepository;
import net.javaguide.springboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Jaffna");
		location.setDescription("Jaffna is the best place to visit");
		location.setLongitude(40.5);
		location.setLatitude(30.5);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Kumaran");
		user1.setLastName("Sanga");
		user1.setEmail("kumaran@gmail.com");
		user1.setPassword("Kumaran@23");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Karthik");
		user2.setLastName("Cool");
		user2.setEmail("karthik@gmail.com");
		user2.setPassword("Karthik@01");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}
