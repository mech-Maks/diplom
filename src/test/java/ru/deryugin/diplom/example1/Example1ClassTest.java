package ru.deryugin.diplom.example1;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import ru.deryugin.diplom.repo.PersonRepository;
import ru.deryugin.diplom.service.example1.Example1Class;
import ru.deryugin.diplom.service.example2.Example2Class;

@SpringBootTest
public class Example1ClassTest {
    @Autowired
    Example1Class example1Class;

    @Test
    public void test123() {
        example1Class.interfaceMethodWithLinkedAop(1);
        example1Class.check();
    }
}
