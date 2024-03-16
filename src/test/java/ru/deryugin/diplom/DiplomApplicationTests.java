package ru.deryugin.diplom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.deryugin.diplom.service.ExampleService;

@SpringBootTest
class DiplomApplicationTests {
    @Autowired
    private ExampleService exampleService;

    @Test
    void exampleServiceTest() throws Exception {
        exampleService.serve();
    }

}
