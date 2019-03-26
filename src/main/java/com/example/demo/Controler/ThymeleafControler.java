package com.example.demo.Controler;

import com.example.demo.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafControler {

    private List<User> users;
    private int a = 0;


    public ThymeleafControler() {
        users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski","qqqqqqqqqq"));
        users.add(new User("Marek", "Nowak","aaaaaaaaaaaaaa"));
        users.add(new User("Leszek", "Stępień","zzzzzzz"));
        this.a = a;
    }

    @RequestMapping("/thymek")
    public String testTymek(Model model) {
        model.addAttribute("model1", "To się wyświetli");
        return "thyme";
    }


    @GetMapping("/userTe")
    public String userTest(Model model) {
        User user = new User("Woktek", "Baron");
        model.addAttribute("klient", users);
        model.addAttribute("opisKlienta", "Nowy klient");
        int i = 22;
        model.addAttribute("liczba", i);
        return "userView";
    }

    @GetMapping("/userList")
    public String userList(Model model) {

        System.out.println(++a);
        model.addAttribute("opisKlienta", "Nowy klient");
        model.addAttribute("klient", users);
        return "userList";
    }

    @GetMapping("/nowy")
    public String nowyKlient(Model model) {
        model.addAttribute("klient", new User());
     //   model.addAttribute("klienci", users);
        return "klientForm";
    }

    @PostMapping("/dodaj")
    public String zapiszKlienta(User user) {
        users.add(user);
//      /  users.add(new User(user));
//        return "redirect:/sukces";
        return "sukces";
    }

//
//    @RequestMapping("/")
//    public String metodaSchronisko1(){
//        System.out.println("Pk");
//        return "redirect:/schronisko.html";
//    }

//    @PostMapping
//    public String saveTask(@RequestParam String fName, String lName){
//        users.add(new User(fName, lName));
//        return "nowy";
//    }


}
