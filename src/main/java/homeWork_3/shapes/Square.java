package homeWork_3.shapes;

import java.util.HashMap;
import java.util.Map;

public class Square implements Shapeable {
    private int lineLenght;

    public Square(int lineLenght) {
        this.lineLenght = lineLenght;
    }


    public Map<String, Object> getVals() {
        return new HashMap<String ,Object>(){
            {
                put("LineA",lineLenght);
                put("LineB",lineLenght);
                put("LineC",lineLenght);
                put("LineD",lineLenght);
            }

        };
    }

    @Override
    public String toString() {
        return "Square{" +
                "lineLenght=" + lineLenght +
                '}';
    }
}
