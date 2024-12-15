package com.tishtech.addapi.service;

import com.tishtech.addapi.response.AddResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AddService {

    public AddResponse add(long firstNumber, long secondNumber) {
        log.info("add() - starts with firstNumber = {} and secondNumber = {}", firstNumber, secondNumber);
        long result = firstNumber + secondNumber;
        log.info("add() - ends with result = {}", result);
        return new AddResponse("ADD", firstNumber, secondNumber, result);
    }
}
