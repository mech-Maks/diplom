package ru.deryugin.diplom.service.example1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.deryugin.diplom.model.PersonEntity;
import ru.deryugin.diplom.repo.PersonRepository;

@Component
@RequiredArgsConstructor
public class Example1Class implements Example1Interface {
    private final PersonRepository personRepository;

    @Override
    public void interfaceMethodWithLinkedAop(String a) {
        return;
    }

    @Override
    public void interfaceMethodWithLinkedAop(Integer a) {
        return;
    }

    public PersonEntity savePerson(PersonEntity person) {
        return personRepository.save(person);
    }

    public void check() {
        interfaceMethodWithLinkedAop("String");
        System.out.println("===========================================");
        interfaceMethodWithLinkedAop(1);
    }
}
