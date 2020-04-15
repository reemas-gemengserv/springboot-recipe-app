package guru.springframework.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public  String getIndexPage(){
        System.out.println("Some messags to say.....12345 55555");
        return "index";
    }
}
