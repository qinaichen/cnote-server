package com.cns.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 祁乃臣
 * @date 2019-09-04
 */
@Controller
public class IndexController {

    @Autowired
    private Environment environment;


    @GetMapping(value = {"","/","/index.html"})
    public String index(Model model){
        model.addAttribute("siteName",environment.getProperty("site.title"));
        return "index";
    }
}
