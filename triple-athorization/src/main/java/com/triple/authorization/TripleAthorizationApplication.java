package com.triple.authorization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@Slf4j
@SpringBootApplication
public class TripleAthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripleAthorizationApplication.class, args);
		log.info("[authorization server is runnung. 한글]");
		log.info("[dev:sws] locale:{}", Locale.getDefault());
	}
}
