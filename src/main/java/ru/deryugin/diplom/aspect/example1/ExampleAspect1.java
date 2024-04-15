package ru.deryugin.diplom.aspect.example1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect1 {

    @Pointcut(value = "execution(* ru.deryugin.diplom.service.example1.Example1Interface.interfaceMethodWithLinkedAop(Integer))")
    public void pointcutForInterfaceMethodWithSignature() {
    }

    @Pointcut(value = "execution(* ru.deryugin.diplom.service.example1.Example1Interface.interfaceMethodWithLinkedAop(..))")
    public void pointcutForInterfaceMethodWithoutSignature() {
    }

    @Pointcut(value = "execution(* ru.deryugin.diplom.service.example1.Example1Class.interfaceMethodWithLinkedAop(String))")
    public void pointcutForClassMethodWithSignature() {
    }

    @Pointcut(value = "execution(* ru.deryugin.diplom.repo.PersonRepository.save(..))")
    public void pointcutForRepository() {
    }


    @Around("pointcutForInterfaceMethodWithSignature()")
    public Object catchInterfaceMethodWithSignature(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("pointcutForInterfaceMethodWithSignature aop advice");
        return joinPoint.proceed();
    }

    @Around("pointcutForInterfaceMethodWithoutSignature()")
    public Object catchInterfaceMethodWithoutSignature(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("pointcutForInterfaceMethodWithoutSignature aop advice");
        return joinPoint.proceed();
    }

    @Around("pointcutForClassMethodWithSignature()")
    public Object catchClassMethodWithSignature(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("pointcutForClassMethodWithSignature aop advice");
        return joinPoint.proceed();
    }
}
