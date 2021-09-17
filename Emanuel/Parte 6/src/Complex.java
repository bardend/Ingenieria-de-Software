public class Complex {
    double eps = 0.0001;

    public NumComplex sumar(NumComplex op1, NumComplex op2) {
        NumComplex ans = new NumComplex(0, 0);

        ans.real = op1.real + op2.real;
        ans.imaginaria = op1.imaginaria + op2.imaginaria;

        return ans;
    }

    public NumComplex restar(NumComplex op1, NumComplex op2) {
        NumComplex ans = new NumComplex(0, 0);

        ans.real = op1.real - op2.real;
        ans.imaginaria = op1.imaginaria - op2.imaginaria;

        return ans;
    }

    public NumComplex multiplicar(NumComplex op1, NumComplex op2) {
        NumComplex ans = new NumComplex(0, 0);

        ans.real = op1.real * op2.real - op1.imaginaria * op2.imaginaria;
        ans.imaginaria = op1.real * op2.imaginaria + op1.imaginaria * op2.real;

        return ans;
    }

    public NumComplex dividir(NumComplex op1, NumComplex op2) {
        NumComplex ans = new NumComplex(0, 0);

        double div = op2.real * op2.real + op2.imaginaria * op2.imaginaria;

        if(div < eps) 
            throw new ArithmeticException("No se puede dividir por 0");

        ans.real = (op1.real * op2.real + op1.imaginaria * op2.imaginaria) / div;
        ans.imaginaria = (-op1.real * op2.imaginaria + op1.imaginaria * op2.real) / div;
        
        return ans;
    }  
}
