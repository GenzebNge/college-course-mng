package com.collegecoursemng.com.collegecoursemng;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




import com.collegecoursemng.com.collegecoursemng.controller.StudentResource;

@SpringBootTest
class ApplicationTests {

	@Autowired
	 private StudentResource studentResource;
	@Test
	void contextLoads () {
		
	}

}
