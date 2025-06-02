package com.company.common.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Aspect			// Adivce를  모아놓은 class
@Component		// bean으로 등록
public class LogAdvice {
	
	@Pointcut("execution(* com.company..*Impl.*(..))")
	public void allpointcut() {}; // 메서드 명 == 포인트컷 이름
	
	// Advice method
	@Before("allpointcut()") //서비스 메서드가 실행되기 전에 실행
	public void logprint(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		log.info("Before서비스 호출" + methodName);
		Object[] args  =  jp.getArgs(); //매개변수 
		if(args != null && args.length > 0) {
			log.info("파라미터 : " + args[0].toString());
		}
	}
	@AfterReturning("allpointcut()")
	public void afterprint(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		log.info("after서비스 호출" + methodName);
	}
	
	@Around("allpointcut()")
	public Object logTime(ProceedingJoinPoint pjp) {
		
		long start = System.currentTimeMillis();
		
		log.info("Target: "+ pjp.getTarget());
		log.info("Param: "+ Arrays.toString(pjp.getArgs()));
		
		//invoke method
		Object result = null;
		
		try {
			result = pjp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		log.info("Time as MiliSecond : " + (end - start));
		return result;
	}
	
	
}

