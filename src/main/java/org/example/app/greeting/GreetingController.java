package org.example.app.greeting;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author Vijay Nadgir
 */
@RestController
public class GreetingController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) {
        System.out.println("Starting hello application"  + new Date());
        return (name + ", Hello how are you ? Today is : " + new Date());
    }


    @RequestMapping("/add")
    public String sayHello(@RequestParam int n1,@RequestParam int n2) {
        System.out.println("Adding two numbers for " + n1 + "," + n2);
        return ( " Sum is : " +  ( Integer.valueOf(n1) + Integer.valueOf(n2)));
    }

}
