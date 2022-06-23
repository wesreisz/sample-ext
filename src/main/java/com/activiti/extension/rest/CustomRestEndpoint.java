package com.activiti.extension.rest;

import com.codahale.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enterprise")
public class CustomRestEndpoint {
    @RequestMapping(value = "/CustomRestEndpoint", method= RequestMethod.GET)
    public String sayHello(@RequestParam(value="name", required=false,
            defaultValue="World") String name) {
        return "Hello World";
    }

    @RequestMapping(value = "/CustomRestEndpoint/{name}", method= RequestMethod.GET)
    public String sayHelloAgain(@PathVariable String name) {
        return "Hello World";
    }

    @Timed
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("-------- Custom Endpoint Successfully called ------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

    }

}
