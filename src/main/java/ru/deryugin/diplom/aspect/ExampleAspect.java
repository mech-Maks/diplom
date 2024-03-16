package ru.deryugin.diplom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import ru.deryugin.diplom.annotation.CheckPermission;

@Aspect
@Component
public class ExampleAspect {
    @Around("@annotation(ru.deryugin.diplom.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return null;
    }

    @Around(value = "@annotation(checkPermission)")
    public Object checkPermission(ProceedingJoinPoint joinPoint, CheckPermission checkPermission) throws Throwable {
        if (checkPermission.isAvailable()) {
            System.out.println("Method available");
            joinPoint.proceed();
        } else {
            System.out.println("method forbidden");
            return null;
        }

        return null;
    }
}
