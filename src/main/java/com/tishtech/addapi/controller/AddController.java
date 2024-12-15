package com.tishtech.addapi.controller;

import com.tishtech.addapi.response.AddResponse;
import com.tishtech.addapi.service.AddService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AddController {

    private final AddService addService;

    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public ResponseEntity<AddResponse> add(@PathVariable long firstNumber, @PathVariable long secondNumber) {
        return ResponseEntity.ok(addService.add(firstNumber, secondNumber));
    }
}
