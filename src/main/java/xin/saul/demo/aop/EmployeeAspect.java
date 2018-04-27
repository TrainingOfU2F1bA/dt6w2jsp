package xin.saul.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

    @Around("execution(* xin.saul.demo.controller.EmployeeController.*(..))")
    public void serviceCoverController(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
    }
}
