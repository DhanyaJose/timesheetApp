package com.ibs.timesheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartupController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView newSolution() {
       return new ModelAndView("index");
    }

}
