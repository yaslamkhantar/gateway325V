package ys.elmoukhantar.api2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cours {

    @GetMapping(name = "/test1",value = "/test1")
    public String afficher(){
        return "cours";
    }

}
