package ru.deryugin.diplom.ws.example1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.deryugin.diplom.service.example1.Example1Class;

@RestController
@RequiredArgsConstructor
public class Example1Controller {
    private final Example1Class example1Class;

    public void method() {
        example1Class.interfaceMethodWithLinkedAop(1);
        example1Class.interfaceMethodWithLinkedAop("");
    }
}
