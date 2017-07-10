package homeWork_3.shapes;


import java.util.HashMap;
import java.util.Map;

public class Circle implements Shapeable {
    private int radius;

    public Circle(int i) {
        radius = i;
    }


    public Map<String, Object> getVals() {
        return new HashMap<String, Object>() {{
            put("radius", radius);
        }};
    }

}
