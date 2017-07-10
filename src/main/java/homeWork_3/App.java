package homeWork_3;

import homeWork_3.shapes.Square;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Square sq = new Square(10);

        Converter converter = Converter.getInstance();

        System.out.println(converter.toXml(sq));
        System.out.println(converter.toJson(sq));
    }
}
