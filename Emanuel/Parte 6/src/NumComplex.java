import java.lang.Math;

public class NumComplex {
    double real, imaginaria;
    double eps = 0.0001;

    public NumComplex(double r, double i) {
        real = r;
        imaginaria = i;
    }

    @Override
    public boolean equals(Object o) {
        NumComplex numcomplex = (NumComplex) o;

        if(Math.abs(real-numcomplex.real) < eps && Math.abs(imaginaria-numcomplex.imaginaria) < eps) 
            return true;
        return false;
    }
}
