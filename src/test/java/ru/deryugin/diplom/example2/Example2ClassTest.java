package ru.deryugin.diplom.example2;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.deryugin.diplom.service.example2.Example2Class;
import ru.deryugin.diplom.service.example2.Example2Interface;

@SpringBootTest
public class Example2ClassTest {
    @Autowired
    Example2Interface example2Class;

    @Test
    public void checkAnnotationAop() throws Exception {
        example2Class.doWork();
    }
}
