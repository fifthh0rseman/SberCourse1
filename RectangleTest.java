package test;

import org.junit.Assert;
import org.junit.Test;
import Figs.Rectangle;

public class RectangleTest {
    @Test
    public void area() {
        Rectangle A = new Rectangle(5, 3);
        double exp = 15.0;
        double act = A.area();
        Assert.assertEquals(exp, act, 0.001);
    }
}