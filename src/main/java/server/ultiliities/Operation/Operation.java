package server.ultiliities.Operation;

public class Operation {
    public static double operation(double a, double b, String op){

        switch (op) {
            case "+":
                return a + b;

            case "-":
                return  a - b;

            case "x":
                return  a * b;

            case ":":
                return  a / b;

            default:

        }
        return 0;
    }

}
