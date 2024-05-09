package ys.elmoukhantar.api3.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoyageWeb {


    @GetMapping(name = "/test1",value = "/test1")
    public String afficher(){
        return "Voyages";
    }
}
