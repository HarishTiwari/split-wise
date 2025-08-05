package com.splitwise.clone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController tells Spring that this class is a Controller.
 * It will handle incoming web requests. Spring automatically converts the
 * return value of methods in this class into a web response (like JSON or plain text).
 */
@RestController
/**
 * @RequestMapping("/api") puts a base URL path on the entire class.
 * This means all endpoints defined in this class will start with "/api".
 * For example, an endpoint "/hello" in this class becomes "/api/hello".
 */
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    /**
     * @GetMapping("/hello") maps this method to handle HTTP GET requests
     * that are sent to the URL "/api/hello".
     *
     * @return A simple String. Spring Web will automatically turn this String
     * into an HTTP response with the text as the body.
     */
    public String sayHello(){
        return "Hello Harish";
    }

}
