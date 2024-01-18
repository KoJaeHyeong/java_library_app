package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// ctrl + option + o : 필요없는 import삭제 해줌

@RestController // RestAPI 진입 지점으로 만들어주는 어노테이션
public class CalculatorController {

    @GetMapping("/add") // GET /add
//    public int addToNumbers(@RequestParam int number1, @RequestParam int number2) { // @RequestParam 쿼리 파라미터 어노테이션
//        System.out.println("number1 + number2 =" + number1 + number2);
//        return number1 + number2;
//    }
    public int addToNumbers(CalculatorAddRequest request) { // @RequestParam 쿼리 파라미터 어노테이션
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply") // POST /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }
}
