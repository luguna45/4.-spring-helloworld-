package com.lugu.helloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class helloworldController {
//    @GetMapping("helloworld")
//    public String helloString(){
//        return "hello";
//    }


    @GetMapping("hello")
    @ResponseBody
    public Hello helloAPI(){
        Hello hello=new Hello();
        return hello;
    }
    static class Hello{
        public String message="helloworld";

    }
////
//    @GetMapping("hello-api")
//    @ResponseBody
//    public Hello helloApi(@RequestParam("name") String name) {
//        Hello hello = new Hello();
//        hello.setName(name);
//        return hello;
//    }
//    static class Hello {
//        private String name;
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
}
