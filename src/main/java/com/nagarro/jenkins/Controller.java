package com.nagarro.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/jenkins")
    public String Hello()
    {
        return "jenkins running successfully";
    }
}
