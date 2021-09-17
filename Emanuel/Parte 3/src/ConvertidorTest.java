import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class ConvertidorTest {
    Convertidor conv;
    double eps = 0.000001;

    @BeforeEach
    public void beforeeach() {
        System.out.println("Before each");
        conv = new Convertidor();
    }

    @Test
    public void testMillasAKilometros() {
        System.out.println("Test Millas A Kilometros");
        
        double millas = 5;
        double expected = 8.0467;
        double actual = conv.MillasAKilometro(millas);

        assertEquals(expected, actual, eps);
    }

    @Test
    public void testKilometrosAMillas() {
        System.out.println("Test Kilometros A Millas");
        
        double kms = 5;
        double expected = 3.106863683249034;
        double actual = conv.KilometroAMillas(kms);

        assertEquals(expected, actual, eps);
    }   

    @Test
    public void testKilogramosALibras() {
        System.out.println("Test Kilogramos A Libras");
        
        double kg = 20;
        double expected = 44.0924;
        double actual = conv.KilogramosALibras(kg);

        assertEquals(expected, actual, eps);
    }   

    @Test
    public void testLibrasAKilogramos() {
        System.out.println("Test Libras A Kilogramos");

        double libras = 20;
        double expected = 9.071858188712795;
        double actual = conv.LibrasAKilogramos(libras);

        assertEquals(expected, actual, eps);
    }

    @AfterEach
    public void aftereach() {
        System.out.println("After each");        
    }
}
