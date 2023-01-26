package com.example.slmpruefungmayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {
    @GetMapping("/square")
    public int squareNumber(int n) {
        return n*n;
    }
}
