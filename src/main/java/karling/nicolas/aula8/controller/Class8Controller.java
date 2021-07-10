package karling.nicolas.aula8.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Class8Controller {

    @GetMapping("/")
    public String homePage(){
        return "exercicios aula8";
    }


}
