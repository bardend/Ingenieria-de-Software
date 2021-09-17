import java.lang.Math;

public class Raices {
    private double ans;

    public Raices() {
        ans = 0;
    }

    public double calcularRaiz(double x) {
        if(x < 0) ans = -999999;
        else ans = Math.sqrt(x);

        return ans;
    }
}
