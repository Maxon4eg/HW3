package homeWork_3;

import homeWork_3.shapes.Shapeable;


public class Converter {
    private static Converter instance = new Converter();

    public static Converter getInstance() {
        return instance;
    }


    private Converter() {
    }

    public String toXml(Shapeable... shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        String tag = "<%s val=%s \\>\n";

        for (Shapeable shape : shapes) {
            sb.append(String.format(tag, "shapeName", shape.getClass().getName()));
            shape.getVals().forEach((k, v) ->
                    {
                        sb.append("\t");
                        sb.append(String.format(tag, k, v.toString()));
                    }
            );
        }
        return sb.toString();
    }

    public String toJson(Shapeable... shapes) {
        StringBuilder sb = new StringBuilder();
        String format = "\"%s\":\"%s\" , \n";

        if (shapes.length == 1) {
            sb.append("{\n");
            shapes[0].getVals().forEach((k, v) ->
                    {
                        sb.append("\t")
                                .append(String.format(format, k, v));

                    }
            );
            sb.deleteCharAt(sb.length() - 3);
            sb.append("}");
            return sb.toString();
        }


        sb.append("{\n \t \"shapes\" :[");
        for (int i = 0; i < shapes.length; ++i) {
            sb.append("\t\t\n")
                    .append("{\"")
                    .append(shapes[i].getClass().getName())
                    .append("\":{\n");
            shapes[i].getVals().forEach((k, v) ->
                    {
                        sb.append("\t\t\t\t");
                        sb.append(String.format(format, k, v));
                    }
            );
            sb.deleteCharAt(sb.length() - 3);
            sb.append("\t\t\t}\n");
        }
        sb.append("\t\t}\n\t]\n}");
        return sb.toString();
    }
}
