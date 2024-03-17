package com.rani.MiniProject.Controller;
import com.rani.MiniProject.Entity.UserData;
import com.rani.MiniProject.Service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller

public class Controller {
    @Autowired
    UserDataService userDataService;

    @GetMapping("/IndexPage")
    public ModelAndView ClickForm(ModelAndView modelAndView)
    {
        modelAndView.setViewName("DataEntry");
        return modelAndView;
    }
    @PostMapping("/saveUserData")
    public ModelAndView SaveEmployee(@ModelAttribute UserData userData, ModelAndView modelAndView)
    {
        UserData user=userDataService.saveUserData(userData);
        System.out.println(userData);
        List<UserData> users = userDataService.findAll();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("DisplayEntries");
        return modelAndView;
    }
    @GetMapping("/HomePage")
    public ModelAndView HomePage(ModelAndView modelAndView)
    {
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
