package com.example.demo.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Aspect
@Component
public class AdviceAspect {
	@Before(value = "execution(* com.example.demo.AOP.AspectService.*(..)) and args(a)")
	public void afterAdvice(JoinPoint joinPoint,Aspect a) {
		System.out.println("after Method: "+joinPoint.getSignature());
		System.out.println(((Aspect) a).getEmail());
	}
		

}
