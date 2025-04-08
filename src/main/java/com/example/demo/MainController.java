package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String returnText() {
        return "Hello";
    }

    @RequestMapping(value = "/{city}")
    @ResponseBody
    public String getTemperature() {
        //example steps
        //fetch the temperature from api (GET request)
        //get JSON back in a String
        //parse the JSON
        return "";//json("temperature");
    }

    @RequestMapping(value = "/color", method = RequestMethod.GET)
    @ResponseBody
    public String getTemperature2(
            @RequestParam("c") String color //query parameters
    ) {
        return color;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public String getTemperature3(
            @ModelAttribute TemperatureInput temperatureInput
    ) {
//        {
//            "location":"Riga",
//            "date":"08-04-2025"
//        }

        //temperatureInput.date
        //temperatureInput.location
        return "";
    }



}
