package org.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class WebController {

    @GetMapping("/web-spring-web/querystring")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World")
            String name,
            Model templateData
    ) {
        templateData.addAttribute("name", name);
        return "querystring";
    }

}