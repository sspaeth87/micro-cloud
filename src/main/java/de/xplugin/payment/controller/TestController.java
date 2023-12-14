package de.xplugin.payment.controller;

import io.micronaut.http.annotation.Controller;

@Controller("test")
public class TestController {

    public String test() {
        return "Hallo !";
    }
}
