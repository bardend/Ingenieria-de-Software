import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class StringHelperTest {
    StringHelper helper;

    @BeforeEach
    public void beforeeach() {
        System.out.println("Before each");
        helper = new StringHelper();
    }

    @Test
    public void testNombre1() {
        System.out.println("Test Nombre 1");
        
        String input = "Raúl/Antonio/Pérez/Del Águila";
        String expected = "Raúl";
        String actual = helper.nombre1(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNombre2() {
        System.out.println("Test Nombre 2");
        
        String input = "Raúl/Antonio/Pérez/Del Águila";
        String expected = "Antonio";
        String actual = helper.nombre2(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testApaterno() {
        System.out.println("Test Apaterno");
        
        String input = "Raúl/Antonio/Pérez/Del Águila";
        String expected = "Pérez";
        String actual = helper.apaterno(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testAmaterno() {
        System.out.println("Test Amaterno");
        
        String input = "Raúl/Antonio/Pérez/Del Águila";
        String expected = "Del Águila";
        String actual = helper.amaterno(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNoNombre2() {
        System.out.println("Test No Nombre2");
        
        String input = "Raúl//Pérez/Del Águila";
        String expected = "";
        String actual = helper.nombre2(input);

        assertEquals(expected, actual);       
    }

    @AfterEach
    public void aftereach() {
        System.out.println("After each");
    }
}
