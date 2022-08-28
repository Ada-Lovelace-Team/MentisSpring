package com.Mentis.Mentis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorGeneral {

    @ResponseBody
    @RequestMapping
    public ResponseEntity<String> saludar(){
        return new ResponseEntity<>("Hola mundo, primera página web con Spring Boot", HttpStatus.OK);
    }

}
