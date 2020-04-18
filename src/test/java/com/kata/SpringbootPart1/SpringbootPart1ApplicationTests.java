package com.kata.SpringbootPart1;

import com.kata.SpringbootPart1.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//please make sure that you're connected to a database in order
// for you to be able to run a test of these functions.
@SpringBootTest
class SpringbootPart1ApplicationTests {
	UserService user;
	@Test
	void contextLoads() {
		user.removeUser(1);
		user.getUser(1);
	}

}
