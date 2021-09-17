import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class GeometricaTest {
    Geometrica geo;
    double eps = 0.000001;

    @BeforeEach
    public void beforeeach() {
        System.out.println("Before each");
        geo = new Geometrica();
    }

    @Test
    public void Test1() {
        System.out.println("Test 1");
        double x1 = 1.1, y1 = 2.7, x2 = 1.1, y2 = 2.7;

        double expected = geo.distancia(x1, y1, x2, y2);
        double actual = 0;

        assertEquals(expected, actual, eps);
    }

    @Test
    public void Test2() {
        System.out.println("Test 2");
        double x1 = -4.09149, y1 = 1.44082, x2 = -2.42836, y2 = 0.76896;

        double expected = geo.distancia(x1, y1, x2, y2);
        double actual = 1.79371;

        assertEquals(expected, actual, eps);
    }

    @Test
    public void Test3() {
        System.out.println("Test 3");
        double x1 = 1.393545906, y1 = 3.0488845027, x2 = 3.0456647257, y2 = 4.3926078094;

        double expected = geo.distancia(x1, y1, x2, y2);
        double actual = 2.12957482;

        assertEquals(expected, actual, eps);
    }

    @Test
    public void Test4() {
        System.out.println("Test 4");
        double x1 = -1.3709995856, y1 = -1.9074719563, x2 = 2.5720573307, y2 = 0.3063672621;

        double expected = geo.distancia(x1, y1, x2, y2);
        double actual = 4.5220329422;

        assertEquals(expected, actual, eps);
    }

    @AfterEach
    public void aftereach() {
        System.out.println("aftereach");
    }
}
