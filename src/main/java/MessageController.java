package hello.world;


import hello.world.ultiliities.MathVariable;
import hello.world.ultiliities.Operation.Operation;
import hello.world.ultiliities.validation.Validation;
import io.micronaut.http.annotation.Controller;

import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.RequestBean;
import jakarta.inject.Inject;

@Controller("/receive")
public class MessageController {


    @Post(value = "/operation")
    public String operation(@RequestBean MathVariable param) {
        if (Validation.isNumeric(String.valueOf(param.getA())) && Validation.isNumeric(String.valueOf(param.getB()))) {
            if (Validation.validateOpe(param.getB(), param.getOpe()) == 1) {
                double m = Operation.operation(param.getA(), param.getB(), param.getOpe());
                return "Result = " + m;
            } else if (Validation.validateOpe(param.getB(), param.getOpe()) == 0) {
                return "You can't put 0 under the denominator";
            } else if (Validation.validateOpe(param.getB(), param.getOpe()) == -1) {
                return "Please enter the right operation (+, -, x, :)";
            }
        } else {
            return "Error";
        }
        return "";
    }

}