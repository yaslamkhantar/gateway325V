package ys.elmoukhantar.api1.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Professeur {

    @GetMapping(name = "/test",value = "/test")
    public String afficher(){
        return "Professeur";
    }
}
