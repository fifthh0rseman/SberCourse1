package test;

import Figs.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import Figs.Square;

public class SquareTest {

    @Test
    public void area() {
        Square A = new Square(5);
        double exp = 25.0;
        double act = A.area();
        Assert.assertEquals(exp, act, 0.001);
    }
}