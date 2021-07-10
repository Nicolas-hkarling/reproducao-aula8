package karling.nicolas.aula8.controller;

import karling.nicolas.aula8.Model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/person")
    public String getPerson(){
        Person person1 =  new Person();
        person1.setName("jorginho");
        person1.setAge(45);
        return person1.toString();
    }
}
