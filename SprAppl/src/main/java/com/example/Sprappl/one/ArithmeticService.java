package com.example.Sprappl.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


	@Service
	public class ArithmeticService {
	private static final Logger log=LoggerFactory.getLogger(ArithmeticService.class);
		public String division(Arithmetic airthematic) {
	log.info("enter service");
			int a = airthematic.getNumber1();
			int b = airthematic.getNumber2();
			int c;
			String s = null;
			if (b == 0) {
				try {
					c = a / b;
				} catch (ArithmeticException e) {
					 return e.getMessage()+" Not possible";
				}
			}
			
			c = a / b;
			 return ("A=" + a + " B= " + b + " divison = :" + c);
		
			
		}
		
		public String addition(Arithmetic arithematic) {
			int parameter1=arithematic.getNumber1();
			int parameter2=arithematic.getNumber2();
			int parameter3=parameter1+parameter2;
					 return ("parameter1=" + parameter1 + " parameter2= " + parameter2 + " addition = :" + parameter3);
			
		}
	}

