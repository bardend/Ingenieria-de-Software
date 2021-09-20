import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class RaicesTest {
    Raices raiz;

    @BeforeEach
    public void beforeeach() {
        System.out.println("Before each");
        raiz = new Raices();
    }

    @Test
    public void test1() {
        System.out.println("Test 1");

        double x = 0;
        double esperado = 0;
        double resultado = raiz.calcularRaiz(x);

        assertEquals(resultado, esperado); 
    }
    

    @Test
    public void test2() {
        System.out.println("Test 2");

        double x = 64;
        double esperado = 8;
        double resultado = raiz.calcularRaiz(x);

        assertEquals(esperado, resultado); 
    }

    @Test
    public void test3() {
        System.out.println("Test 3");

        double x = 0.01;
        double esperado = 0.1;
        double resultado = raiz.calcularRaiz(x);

        assertEquals(esperado, resultado); 
    }

    @Test
    public void test4() {
        System.out.println("Test 4");

        double x = -6;
        double esperado = -999999;
        double resultado = raiz.calcularRaiz(x);

        assertEquals(esperado, resultado); 
    }

    @AfterEach
    public void aftereach() {
        System.out.println("After each");        
    }
}
