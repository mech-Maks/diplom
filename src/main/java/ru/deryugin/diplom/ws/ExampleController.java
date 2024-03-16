package ru.deryugin.diplom.ws;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.deryugin.diplom.service.ExampleService;

@RestController
@RequestMapping("/example/aspect")
@RequiredArgsConstructor
public class ExampleController {
    private final ExampleService exampleService;

    @GetMapping
    public Long exampleMethod() throws Exception {
        return exampleService.serve();
    }
}
