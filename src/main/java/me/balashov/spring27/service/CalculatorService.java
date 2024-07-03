package me.balashov.spring27.service;

import me.balashov.spring27.controller.CalculatorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorService {
    public int getSummary(int num1, int num2) {
        return num1 + num2;
    }

    public int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public int getDivision(int num1, int num2) {
        return num1 / num2;
    }
}