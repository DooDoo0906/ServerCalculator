package hello.world.ultiliities;

import io.micronaut.core.annotation.Introspected;
import jakarta.inject.Singleton;

@Singleton
@Introspected
public class MathVariable {
    private double a;
    private double b;
    private String ope;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOpe() {
        return ope;
    }

    public void setOpe(String ope) {
        this.ope = ope;
    }

    public MathVariable(double a, double b, String ope) {
        this.a = a;
        this.b = b;
        this.ope = ope;
    }
}
