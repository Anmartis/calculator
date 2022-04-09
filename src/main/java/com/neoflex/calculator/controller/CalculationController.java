package com.neoflex.calculator.controller;

import com.neoflex.calculator.calculation.СalculationProcess;
import com.neoflex.calculator.notification.Notification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api()
public class CalculationController {

    @ApiOperation("Тестовый метод")
    @GetMapping("/")
    public String getHomePage() {
        return Notification.HOME_PAGE;
    }

    @GetMapping("{number1}*{number2}")
    @ApiOperation("Метод для умножения")
    public String getMultiply(@PathVariable String number1, @PathVariable String number2) {
        return СalculationProcess.calculations(number1, number2, "*");
    }

    @GetMapping("{number1}/{number2}")
    @ApiOperation("Метод для деления")
    public String getDivide(@PathVariable String number1, @PathVariable String number2) {
        if (number1.equals("0")) return Notification.DIVIDE_BY_ZERO;
        return СalculationProcess.calculations(number1, number2, "/");
    }

    @GetMapping("{number1}+{number2}")
    @ApiOperation("Метод для сложения")
    public String getAdd(@PathVariable String number1, @PathVariable String number2) {
        return СalculationProcess.calculations(number1, number2, "+");
    }

    @GetMapping("{number1}-{number2}")
    @ApiOperation("Метод для вычитания")
    public String getSubtract(@PathVariable String number1, @PathVariable String number2) {
        return СalculationProcess.calculations(number1, number2, "-");
    }
}
