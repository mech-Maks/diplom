package ru.deryugin.diplom.service;

import ru.deryugin.diplom.annotation.CheckPermission;
import ru.deryugin.diplom.annotation.LogExecutionTime;

public interface ExampleInterface {
    @LogExecutionTime
    @CheckPermission(isAvailable = true)
    void serve() throws InterruptedException;
}
