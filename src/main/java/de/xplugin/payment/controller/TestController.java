package de.xplugin.payment.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("test")
public class TestController {
    @Get
    public String test() {
        return "Hallo Sebastian!";
    }
}
