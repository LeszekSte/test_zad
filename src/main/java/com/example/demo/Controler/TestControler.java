package com.example.demo.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControler {

    @RequestMapping("/test123")
    public String metodaTest(){
        return "test22";
    }


    @RequestMapping("/test3")
    public String metodaTe33t(){
        System.out.println("leszekhhhhh");
        return "test";
    }

    @RequestMapping("/test4")
    public String test4(){
        System.out.println("leszekh");
        return "redirect:/testL.html";
    }
    @RequestMapping("/test5")
    public String test5(){

        return "test55.html";
    }

    @RequestMapping("/kot")
    public String metodakot(){
        System.out.println("kocur");
        return "kot";
    }

    @RequestMapping("/pies")
    public String metodaPies() {
        System.out.println("Piesek");
        return "pies";
    }
    @RequestMapping("/")
    public String metodaSchronisko(){
        System.out.println("Pk");
        return "redirect:/schronisko.html";
    }

}
