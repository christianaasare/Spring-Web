package io.turntabl.springweb.Controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turntabl.springweb.Models.Maths;
import io.turntabl.springweb.Models.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MathsController {
    @Autowired
    private Maths calculate;
    @ApiOperation("addition calculation of two integer numbers")
    @RequestMapping("/addition")
    public Number add(@RequestParam(value = "num1") String num1,
                      @RequestParam(value = "num2") String num2) {
        Integer numb1 = Integer.parseInt(num1);
        Integer numb2 = Integer.parseInt(num2);
        Number number = new Number();
        number.setValue(numb1 + numb2);
        return number;

    }

    @ApiOperation("subtraction calculation of two integer numbers")
  @RequestMapping("/subtraction")
    public Number subtract(@RequestParam(value = "num1",defaultValue ="4" )String num1,
                           @RequestParam(value = "num2",defaultValue ="4" )String num2){

        Integer numb1 =Integer.parseInt(num1);
        Integer numb2= Integer.parseInt(num2);
        Number number = new Number();
        number.setValue(numb1 + numb2);
        return number;
    }

}
