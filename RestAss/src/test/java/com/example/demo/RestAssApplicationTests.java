package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;

@SpringBootTest
class RestAssApplicationTests {
	@org.testng.annotations.Test
	@Test
	void contextLoads() {
		class StudentApplicationTests {
			@org.testng.annotations.Test
			void contextLoads() {
				RestAssured.baseURI = "http://localhost:8080";
				RestAssured.given().get("/selectone").then().statusCode(200).log().body();
				System.out.println("ok");
			}
			
			@org.testng.annotations.Test
			@Test
			
			public static void getResponseTime(){
			RestAssured.baseURI = "http://localhost:8080";
			 System.out.println("time to finish"+RestAssured.given().get("/selectone").
			        timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
			}
		}

	}

}
