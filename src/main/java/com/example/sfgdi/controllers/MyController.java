package com.example.sfgdi.controllers;/* created by akshaypaswan on 10/01/21 */

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!");
        return "Hi Folks!";
    }
}
