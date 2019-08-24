package pl.sda.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring.Calculator;
import pl.sda.spring.model.Calculation;

@RestController
public class CalculatorController {

    private final Calculator calculator;

    @Value("${result.string}")
    private String resultString;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @PostMapping("/calculate")
    public String calculate(@RequestBody Calculation calculation) {
        return resultString + calculator.calculate(calculation.getOperationType(), calculation.getArg1(), calculation.getArg2());
    }
}
