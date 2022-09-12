package сontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import сontroller.callculatorService.CallculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CallculatorService callculatorService;

    public CalculatorController(CallculatorService callculatorService) {
        this.callculatorService = callculatorService;
    }

    @GetMapping
    public String greeting() {
        return "<h1>Добро пожаловать калькулятор </h1>";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name= "num1") Integer a,
                       @RequestParam(name= "num2") Integer b) {
        return a + "+" + b + " = " + callculatorService.sum(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name= "num1") Integer a,
                       @RequestParam(name= "num2") Integer b) {
        return a + "-" + b + " = " + callculatorService.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name= "num1") Integer a,
                           @RequestParam(name= "num2") Integer b) {
        return a + "*" + b + " = " + callculatorService. mulyiply(a, b);
    }
    @GetMapping("/divide")
    public String divide (@RequestParam(name= "num1") Integer a,
                          @RequestParam(name= "num2") Integer b) {
        return a + "/" + b + " = " + callculatorService.divide(a, b);
        }
    }




