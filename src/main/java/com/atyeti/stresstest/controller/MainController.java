package com.atyeti.stresstest.controller;

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
        /*ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command("bash", "/c", "sudo get-apt install stress");
        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        int exitCode = process.waitFor();
        System.out.println("\nExited with error code : " + exitCode);
    }*/
        System.out.println("testapi called ................");
    }

    @GetMapping("/teststressng")
    public void testStressNg() {
        try {
            Process process = Runtime.getRuntime().exec("stress-ng --cpu 4 --timeout 60s");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String s = null;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("testapi called ................");
    }


}
