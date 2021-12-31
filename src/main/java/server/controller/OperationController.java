package server.controller;


import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.RequestBean;
import server.ultiliities.MathVariable;
import server.ultiliities.Operation.Operation;
import server.ultiliities.validation.Validation;


@Controller("/receive")
public class OperationController {

    @Post(value = "/operation")
    public String operation(@Body MathVariable param) {
        if (Validation.isNumeric(String.valueOf(param.getA())) && Validation.isNumeric(String.valueOf(param.getB()))) {
            if (Validation.validateOpe(param.getB(), param.getOpe()) == 1) {
                double m = Operation.operation(param.getA(), param.getB(), param.getOpe());
                System.out.println("{"+param.getA()+", "+param.getB()+", "+ param.getOpe()+"}");
                System.out.println("Result: "+m);
                return "Result = " + m;
            } else if (Validation.validateOpe(param.getB(), param.getOpe()) == 0) {
                System.out.println("You can't put 0 under the denominator");

                return "You can't put 0 under the denominator";
            } else if (Validation.validateOpe(param.getB(), param.getOpe()) == -1) {
                System.out.println("Please enter the right operation (+, -, x, :)");
                return "Please enter the right operation (+, -, x, :)";
            }
        } else {
            return "Error";
        }
        return "";
    }

}