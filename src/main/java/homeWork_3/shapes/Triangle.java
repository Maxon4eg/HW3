package homeWork_3.shapes;

import java.util.HashMap;
import java.util.Map;

public class Triangle implements Shapeable {

    private int hypotenuse;
    private int cathetLenght1;
    private int cathetLenght;

    public Triangle(int hypotenuse, int cathetLenght1, int cathetLenght) {
        this.hypotenuse = hypotenuse;
        this.cathetLenght1 = cathetLenght1;
        this.cathetLenght = cathetLenght;
    }


    public Map<String, Object> getVals() {
        return new HashMap<String, Object>() {
            {
                put("hypetenuse",hypotenuse);
                put("cathetLenght",cathetLenght);
                put("cathetLenght1",cathetLenght1);
            }
        };
    }

}
