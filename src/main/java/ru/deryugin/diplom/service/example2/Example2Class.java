package ru.deryugin.diplom.service.example2;

import org.springframework.stereotype.Component;
import ru.deryugin.diplom.annotation.LogExecutionTime;


@Component
public class Example2Class implements Example2Interface {
    @LogExecutionTime
    @Override
    public void doWork() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("interface method executed");
        Thread.sleep(500);
    }

    @LogExecutionTime
    public void classMethod() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("class method executed");
        Thread.sleep(500);
    }
}
