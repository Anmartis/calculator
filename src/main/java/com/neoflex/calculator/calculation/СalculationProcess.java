package com.neoflex.calculator.calculation;

import org.apache.commons.lang3.math.NumberUtils;

import static com.neoflex.calculator.notification.Notification.ERROR;
import static com.neoflex.calculator.notification.Notification.NOT_NUMBER;

public class СalculationProcess {

    public static String calculations(String numberAsString1, String numberAsString2, String operation)
    {
        if (!NumberUtils.isDigits(numberAsString1)) return ERROR + numberAsString1 + NOT_NUMBER;
        if (!NumberUtils.isDigits(numberAsString2)) return ERROR + numberAsString2 + NOT_NUMBER;

        float n1 = Float.parseFloat(numberAsString1);
        float n2 = Float.parseFloat(numberAsString2);
        float result = 0;

        switch (operation) {
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
        }

        return String.valueOf(result);
    }


}
