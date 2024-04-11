package com.pumsdev.springmicrometer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
public class SimpleController {
    @GetMapping(value = "/test")
    public String simpleCon() {

        String pattern = "HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("th", "TH"));
        String date = simpleDateFormat.format(new Date());
        return "test man! " + date;

    }
}
