package com.example.demo.AspectDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectServiceAspect {
	public static Logg
	@Before(value = "execution(* com.example.demo.AspectDemo.AspectServiceAspect.*(..)) and args(ad)")
	public void afterAdvice(JoinPoint joinPoint,AspectDemo ad) {
		System.out.println("after Method: "+joinPoint.getSignature());
		System.out.println();
}
}
