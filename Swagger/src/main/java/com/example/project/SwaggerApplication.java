package com.example.project;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

public static void main(String[] args) {
SpringApplication.run(SwaggerApplication.class, args);
}
@Bean
public Docket api() {
return new Docket(DocumentationType.SWAGGER_2).groupName("users-public-api")
.select().apis(RequestHandlerSelectors.any())
.paths(PathSelectors.any())
.build()
.pathMapping("/").enableUrlTemplating(true);

}
@Bean
public JavaMailSender getJavaMailSender() {
JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
mailSender.setHost("smtp.gmail.com");
mailSender.setPort(587);

mailSender.setUsername("dhileepchinni2123@gmail.com");
mailSender.setPassword("bqirkkuvochgvfnk");

Properties props = mailSender.getJavaMailProperties();
props.put("mail.transport.protocol", "smtp");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.debug", "true");

return mailSender;
}
}