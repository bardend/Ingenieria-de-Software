import java.lang.Math;

public class Geometrica {
    double distancia(double x1, double y1, double x2, double y2) {
        double dx = x1-x2;
        double dy = y1-y2;

        return Math.sqrt(dx*dx + dy*dy);
    }
}