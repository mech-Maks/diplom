package ru.deryugin.diplom.aspect.example2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect2 {

    @Pointcut(value = "@annotation(ru.deryugin.diplom.annotation.LogExecutionTime)")
    public void pointcutForAnnotation() {
        // отображу в плагине только этот способ объявления
    }

    @Around("pointcutForAnnotation()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms (point-cut declaration)");
        return null;
    }

    @Around("@annotation(ru.deryugin.diplom.annotation.LogExecutionTime)")
    public Object logExecutionTime1(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms (direct around declaration)");
        return null;
    }
}
