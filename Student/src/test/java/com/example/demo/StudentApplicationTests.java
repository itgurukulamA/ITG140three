package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;

@SpringBootTest
class StudentApplicationTests {
	@org.testng.annotations.Test
	void contextLoads() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/selection").then().statusCode(200).log().body();
		System.out.println("ok");
	}
	
	@org.testng.annotations.Test
	public static void getResponseTime(){
	RestAssured.baseURI = "http://localhost:8080";
	 System.out.println("time to finish"+RestAssured.given().get("/selection").
	        timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
	}
}
