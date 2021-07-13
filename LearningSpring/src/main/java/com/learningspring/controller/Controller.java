package com.learningspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String abrirIndex() {
        return "index";
    }
}