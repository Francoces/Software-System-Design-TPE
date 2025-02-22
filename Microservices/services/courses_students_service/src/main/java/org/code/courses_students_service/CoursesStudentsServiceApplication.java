package org.code.courses_students_service;

import jakarta.persistence.EntityListeners;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
public class CoursesStudentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesStudentsServiceApplication.class, args);
	}

}
