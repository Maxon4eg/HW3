package homeWork_3;

import homeWork_3.shapes.Circle;
import homeWork_3.shapes.Shapeable;
import homeWork_3.shapes.Square;
import homeWork_3.shapes.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Unit test for simple App.
 */
@RunWith(Parameterized.class)
public class AppTest {

    private Shapeable shape;
    private Converter converter = Converter.getInstance();

    @Parameterized.Parameters(name = "Shapes{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]
                        {
                        {new Square(10)},
                        {new Circle(15)},
                        {new Triangle(15, 10, 5)},
                });
    }

    public AppTest(Shapeable shape) {
        this.shape = shape;

    }

    /**
     * Rigourous Test :-)
     */

    @Test
    public void testApp() {
        Assert.assertTrue(shape.getVals().size() > 0);
    }

    @Test
    public void testConvertToXml() throws Exception {
        Assert.assertFalse(converter.toXml(shape).isEmpty());
    }

    @Test
    public void testConvertToJson() throws Exception {
        Assert.assertFalse(converter.toJson(shape).isEmpty());
    }
}
