package ru.deryugin.diplom.service.example2;

import ru.deryugin.diplom.annotation.LogExecutionTime;

public interface Example2Interface {
    @LogExecutionTime
    void doWork() throws InterruptedException;
}
