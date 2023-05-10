package com.example.GradleProject;

import org.springframework.stereotype.Component;

@Component
public class PrintServiceImp implements PrintService {
    public void print(String message) {
        System.out.println(message);
    }
}
