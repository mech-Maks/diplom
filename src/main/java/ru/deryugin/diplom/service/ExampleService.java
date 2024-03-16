package ru.deryugin.diplom.service;

import org.springframework.stereotype.Service;
import ru.deryugin.diplom.annotation.CheckPermission;
import ru.deryugin.diplom.annotation.LogExecutionTime;

@Service
public class ExampleService implements ExampleInterface {

    @LogExecutionTime
    @CheckPermission(isAvailable = true)
    public Long serve() throws InterruptedException {
        System.out.println("Started execution");
        Thread.sleep(500);
        System.out.println("Finished execution");
        return 1L;
    }
}
