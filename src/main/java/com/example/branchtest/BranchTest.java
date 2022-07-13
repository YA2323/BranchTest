package com.example.branchtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BranchTest {

    @GetMapping
    public String sayHello() {
        return "WELCOME!";
    }

}
