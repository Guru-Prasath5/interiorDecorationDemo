package com.interior.decoration.demo.controller;

import com.interior.decoration.demo.model.customer;
import com.interior.decoration.demo.service.serviceCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    serviceCustomer serviceCustomer;

    @RequestMapping(value = { "/customer" }, method = RequestMethod.GET)
    public ModelAndView helloWolrd(Locale locale, Model model){
        ModelAndView home = new ModelAndView("homePage");
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);
        List<customer> data = serviceCustomer.findAll();
        home.getModelMap().addAttribute("data", data );

        model.addAttribute("serverTime", formattedDate );
        return home;
    }
    @RequestMapping(value = { "/RegisterCustomer" }, method = RequestMethod.GET)
    public ModelAndView regCustomer(Locale locale, Model model){
        ModelAndView registerCustomer = new ModelAndView("registerCustomer");
        return registerCustomer;
    }
    @RequestMapping(value = { "/register" }, method = RequestMethod.POST)
    public ModelAndView registerSave(@ModelAttribute("customer") customer cust){
        customer response= serviceCustomer.createCustomer(cust);
        logger.info("response=--"+response.toString());
        ModelAndView home = new ModelAndView("homePage");
        List<customer> data = serviceCustomer.findAll();
        home.getModelMap().addAttribute("data", data );

            return home;

    }

}
