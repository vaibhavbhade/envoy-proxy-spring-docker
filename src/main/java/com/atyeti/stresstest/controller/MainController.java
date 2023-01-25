package com.atyeti.stresstest.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController

public class MainController {


    @GetMapping("/testapi")
    public void testLinux() throws IOException, InterruptedException {

        System.out.println("testapi called ................");
    }
}
