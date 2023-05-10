package com.example.GradleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private PrintService printService;

    public void doSomething() {
        String message = "Hello, world!";
        printService.print(message);
    }
}
