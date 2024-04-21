package ru.deryugin.diplom.ws.example2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.deryugin.diplom.service.example1.Example1Class;
import ru.deryugin.diplom.service.example2.Example2Class;

@RestController
@RequiredArgsConstructor
public class Example2Controller {
    private final Example2Class example2Class;

    public void method() throws Exception{
        example2Class.classMethod();
    }
}