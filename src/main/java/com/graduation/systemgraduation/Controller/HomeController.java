package com.graduation.systemgraduation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/cerimonias")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("msg", "foi");
        return mv;
    }

}
