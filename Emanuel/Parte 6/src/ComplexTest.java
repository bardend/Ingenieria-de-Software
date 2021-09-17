import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class ComplexTest {
    Complex calc;

    @BeforeEach
    public void beforeeach() {
        System.out.println("Before each");
        calc = new Complex();
    }

    @Test
    public void testSuma() {
        NumComplex a = new NumComplex(0.5, 6.23), b = new NumComplex(4.2, -1.5);
        NumComplex expected = new NumComplex(4.7, 4.73);
        NumComplex actual = calc.sumar(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testResta() {
        NumComplex a = new NumComplex(0.5, 6.23), b = new NumComplex(4.2, -1.5);
        NumComplex expected = new NumComplex(-3.7, 7.73);
        NumComplex actual = calc.restar(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplicar() {
        NumComplex a = new NumComplex(0.5, 6.23), b = new NumComplex(4.2, -1.5);
        NumComplex expected = new NumComplex(11.445, 25.416);
        NumComplex actual = calc.multiplicar(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        NumComplex a = new NumComplex(0.5, 6.23), b = new NumComplex(4.2, -1.5);
        NumComplex expected = new NumComplex(-0.36425, 1.35324);
        NumComplex actual = calc.dividir(a, b);

        assertEquals(expected, actual);
    }

    @AfterEach
    public void aftereach() {
        System.out.println("After each");
    }
}
