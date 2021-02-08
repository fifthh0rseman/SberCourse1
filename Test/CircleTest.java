package test;
import org.junit.Assert;
import org.junit.Test;
import Figs.Circle;
public class CircleTest {

    @Test
    public void area() {
        Circle A = new Circle(6);
        double exp = 0.25*6.0*6.0*Math.PI;
        double act = A.area();
        Assert.assertEquals(exp, act, 0.001);
    }
}
